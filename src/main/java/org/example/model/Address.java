package org.example.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Address {
    @CsvBindByPosition(position = 1)
    private String code;

    @CsvBindByPosition(position = 3)
    private String roadnameKr;

    @CsvBindByPosition(position = 4)
    private String roadnameEn;
}
