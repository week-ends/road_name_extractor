package org.example;

import com.opencsv.bean.CsvToBeanBuilder;
import lombok.extern.log4j.Log4j2;
import org.example.model.Address;

import java.io.FileReader;
import java.util.List;


@Log4j2
public class AddressReader{
    static List<Address> addressList;
    public static List readAddressCsvFile(String csvPath) throws Exception {
        addressList = new CsvToBeanBuilder(new FileReader(csvPath))
                .withType(Address.class)
                .withSkipLines(1)
                .build()
                .parse();
        return addressList;
    }
}
