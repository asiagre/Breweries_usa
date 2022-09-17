package com.example.breweries_us;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.NamedNativeQuery;

interface BreweryRepository extends JpaRepository<Brewery, Long> {
}
