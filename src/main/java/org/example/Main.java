package org.example;

import org.example.model.Address;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static List<Address> standardAddressList;

    public static void getStandardAddressList() throws Exception {
        String standaradAddrCsvPath = "src/main/resources/sources/addr.csv";
        AddressReader standardAddressReader = new AddressReader();
        standardAddressList = standardAddressReader.readAddressCsvFile(standaradAddrCsvPath);
    }

    public static void main(String[] args) {
        String inputText = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("\n수기로 작성한 주소를 입력해주세요");
            inputText = reader.readLine();

            getStandardAddressList();

            Extractor extractor = new Extractor();
            String roadName = extractor.getRoadName(standardAddressList, inputText);
            System.out.println("\n\n추출된 도로명 : " + roadName + "\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

}