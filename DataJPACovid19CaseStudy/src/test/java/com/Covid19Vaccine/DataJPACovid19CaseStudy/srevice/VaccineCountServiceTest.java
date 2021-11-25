package com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Vaccine;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.VaccineCount;

@SpringBootTest
class VaccineCountServiceTest {

	@Autowired
	private VaccineCountService vaccineCountService;

	@Test
	public void addVaccineCount() {
		Vaccine vaccine = new Vaccine(3, "abd", "ghd");
		VaccineCount vaccineCount = new VaccineCount(vaccine, 36, 56);
		vaccineCountService.addVaccineCount(vaccineCount);
	}

	@Test
	public void getAllVaccine() {

		List<VaccineCount> vaccineCount = vaccineCountService.getAllVaccine();

	}

	@Test
	public void gerPrice() {
		VaccineCount vaccineCount = vaccineCountService.getPrice(150);
	}

	@Test
	public void getQuantity() {
		VaccineCount vaccineCount = vaccineCountService.getQuantity(30);
	}

}
