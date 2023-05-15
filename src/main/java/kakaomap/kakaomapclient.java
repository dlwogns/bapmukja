package kakaomap;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
public class kakaomapclient {
    private RestTemplate restTemplate;
    public  kakaomapclient(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public String getAddress(String keyWord) {
        URI uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("dapi.kakao.com")
                .path("/v2/local/search/keyword.json")
                .queryParam("query", keyWord)
                .encode()
                .build()
                .toUri();

        RequestEntity requestEntity = RequestEntity
                .get(uri)
                .header("Authorization", "KakaoAK " + )
                .build();

        ResponseEntity<String> result = restTemplate.exchange(requestEntity, String.class);
        return result.getBody();
    }
}
