package pe.edu.cibertec.app_reqres_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AppReqresClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppReqresClientApplication.class, args);
	}

}
