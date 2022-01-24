package come.abduk.blacklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlacklistApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlacklistApplication.class,args);
    }
}
