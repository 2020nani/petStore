package br.com.petrepet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Slf4j
@SpringBootApplication
public class PetrepetApplication {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date hora = Calendar.getInstance().getTime();

		String dataFormatada = sdf.format(hora);
		System.out.println(hora);
		SpringApplication.run(PetrepetApplication.class, args);
	}

}
