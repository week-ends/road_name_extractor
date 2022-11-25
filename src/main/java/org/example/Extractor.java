package org.example;

import org.example.model.Address;
import org.example.model.AddressDocument;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractor{
    public static String getRoadName(List<Address> standardAddressList, String input_text) throws Exception {
        String result = "";
        Pattern pattern = Pattern.compile("[가-힣A-Za-z·\\d~\\-\\.]{2,}(로|길)");

        Matcher matcher = pattern.matcher(input_text.replaceAll("\\s",""));

        while(matcher.find()){
            String cleanWord = matcher.group().replaceAll("[^ㄱ-ㅎㅏ-ㅣ가-힣a-zA-Z0-9·. ]", "");
            for (Address address : standardAddressList) {
                String roadnameKr = address.getRoadnameKr();
                if (cleanWord.contains(roadnameKr)){
                    result =  roadnameKr;
                }
            }
        }
        return result;
    }

}
