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

}
