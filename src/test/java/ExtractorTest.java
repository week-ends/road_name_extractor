import org.example.AddressReader;
import org.example.Extractor;
import org.example.model.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ExtractorTest {

    @Test
    public void Extractor() throws Exception {
        String standaradAddrCsvPath = "src/main/resources/sources/addr.csv";
        AddressReader standardAddressReader = new AddressReader();
        List<Address> standardAddressList = standardAddressReader.readAddressCsvFile(standaradAddrCsvPath);

        Extractor extractor = new Extractor();

        Assertions.assertEquals("백현로", extractor.getRoadName(standardAddressList, "성남, 분당 백 현 로 265, 푸른마을 아파트로 보내주세요!!"));
        Assertions.assertEquals("도화2길", extractor.getRoadName(standardAddressList, "마포구 도화-2길 코끼리분식"));
    }
}
