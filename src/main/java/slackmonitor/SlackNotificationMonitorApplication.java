

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EntityScan(basePackageClasses = SlackNotificationMonitorApplication.class)
public class SlackNotificationMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlackNotificationMonitorApplication.class, args);
    }
}
