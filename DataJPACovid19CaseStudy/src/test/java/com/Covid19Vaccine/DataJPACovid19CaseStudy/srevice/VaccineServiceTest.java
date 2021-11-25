package com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Vaccine;

@SpringBootTest
class VaccineServiceTest {

	@Autowired
	private VaccineService vaccineService;

	@Test
	public void getAllVaccine() {
		List<Vaccine> vaccine = vaccineService.getAllVaccine();
		System.out.println(vaccine);

	}

	@Test
	public void findByid() {
		Vaccine vaccine = vaccineService.findByVaccineId(1);
		System.out.println(vaccine);
	}

	@Test
	public void addVaccine() {
		Vaccine vaccine = new Vaccine(1, "CoviShield", "80 days");
		vaccineService.addVaccine(vaccine);
	}

	@Test
	public void updatevaccine() {
		Vaccine vaccine=new Vaccine(1, "Covi", "60 days");
		vaccineService.updateVaccine(vaccine);
	}

}
