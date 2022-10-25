package oit.is.work05.kaizi.work05_8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class SpringbootSamplesApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootSamplesApplication.class, args);
  }

}
