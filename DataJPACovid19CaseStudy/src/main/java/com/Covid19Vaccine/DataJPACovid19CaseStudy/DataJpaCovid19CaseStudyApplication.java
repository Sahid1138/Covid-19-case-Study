package com.Covid19Vaccine.DataJPACovid19CaseStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Admin;

@SpringBootApplication
@ComponentScan("com.*")
@EntityScan("com.Covid19Vaccine.DataJPACovid19CaseStudy.entity")
public class DataJpaCovid19CaseStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJpaCovid19CaseStudyApplication.class, args);
		System.out.println("Success");
	}

}
