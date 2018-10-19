package st.curatedli.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "st.curatedli.controller")
public class CuratedListApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuratedListApplication.class, args);
	}
}
