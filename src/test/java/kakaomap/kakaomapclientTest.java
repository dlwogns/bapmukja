package kakaomap;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class kakaomapclientTest {
    RestTemplate restTemplate = new RestTemplate();
    kakaomapclient Kakaomapclient = new kakaomapclient(restTemplate);
    @Test
    void 테스트() {
        try{
            System.out.println(Kakaomapclient.getAddress("일식"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}