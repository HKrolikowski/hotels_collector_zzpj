package pl.lodz.p.it.zzpj.hotelscollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class HotelsCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelsCollectorApplication.class, args);
	}

}