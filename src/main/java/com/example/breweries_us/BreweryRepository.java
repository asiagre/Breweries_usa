package com.example.breweries_us;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface BreweryRepository extends JpaRepository<Brewery, Long> {

    @Query(value = "select city from brewery group by city order by count(*) desc limit 3", nativeQuery = true)
    List<Object> findTopCitiesForBrewery();

    int countAllByWebsitesNotNull();

    int countBreweryByMenusContains(String str);

    @Query(value = "select count(*) from (select count(*) from brewery group by name, address having count(*) > 1) as duplicated", nativeQuery = true)
    int countDuplicatedBreweries();
}
