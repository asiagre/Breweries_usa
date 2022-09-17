package com.example.breweries_us;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class CsvReaderService {

    private static final String TEST_FILE = "src/main/resources/files/test.csv";
    private static final String FILE = "src/main/resources/files/breweries_usa - breweries_usa.csv";

    public List<BreweryCsvDto> readCsvBean() throws Exception {
        Path myPath = Paths.get(FILE);

        try (BufferedReader br = Files.newBufferedReader(myPath,
                StandardCharsets.UTF_8)) {

            ColumnPositionMappingStrategy<BreweryCsvDto> strategy
                    = new ColumnPositionMappingStrategy<>();
            strategy.setType(BreweryCsvDto.class);

            CsvToBean<BreweryCsvDto> csvToBean = new CsvToBeanBuilder<BreweryCsvDto>(br)
                    .withMappingStrategy(strategy)
                    .withEscapeChar('\0')
                    .withSkipLines(1)
                    .withFieldAsNull(CSVReaderNullFieldIndicator.EMPTY_SEPARATORS)
                    .build();

            return csvToBean.parse();
        }
    }
}
