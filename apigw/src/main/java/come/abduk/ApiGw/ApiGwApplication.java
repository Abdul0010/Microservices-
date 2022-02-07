package come.abduk.ApiGw;

import io.netty.util.Constant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGwApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiGwApplication.class);
    }
}
