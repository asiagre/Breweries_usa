package com.example.breweries_us;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BreweryService {

    private BreweryRepository breweryRepository;
    private CsvReaderService csvReaderService;

    public void importBreweries() {
        try {
            breweryRepository.saveAll(csvReaderService.readCsvBean().stream()
                    .map(BreweryCsvDto::toEntity)
                    .collect(Collectors.toList()));
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void printInformation() {
        System.out.print("Top cities for breweries are: ");
        breweryRepository.findTopCitiesForBrewery().forEach(s -> System.out.print(s + " "));
        System.out.println();

        System.out.print("Breweries count with link to website: ");
        System.out.print(breweryRepository.countAllByWebsitesNotNull());
        System.out.println();

        System.out.print("Breweries count which served tacos: ");
        System.out.print(breweryRepository.countBreweryByMenusContains("taco"));
        System.out.println();

        System.out.print("Number of duplicated breweries: ");
        System.out.print(breweryRepository.countDuplicatedBreweries());
        System.out.println();

    }
}
