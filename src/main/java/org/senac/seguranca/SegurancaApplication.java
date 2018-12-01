package org.senac.seguranca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SegurancaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegurancaApplication.class, args);
	}
}
