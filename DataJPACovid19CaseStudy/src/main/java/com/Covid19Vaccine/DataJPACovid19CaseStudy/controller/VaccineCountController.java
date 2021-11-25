package com.Covid19Vaccine.DataJPACovid19CaseStudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Vaccine;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.VaccineCount;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice.VaccineCountService;

@RestController
@RequestMapping(value = "/vaccinecount")
public class VaccineCountController {
	@Autowired
	private VaccineCountService vaccineCountSrevice;

	@GetMapping("/vaccines")
	public List<VaccineCount> getAllVaccine() {
		return vaccineCountSrevice.getAllVaccine();
	}

	@GetMapping("/price")
	public VaccineCount getPrice(@RequestBody Integer price) {
		return vaccineCountSrevice.getPrice(price);
	}

	@GetMapping("/quantity")
	public VaccineCount getQuantity(@RequestBody Integer quantity) {
		return vaccineCountSrevice.getQuantity(quantity);
	}

	@PostMapping("/add")
	private VaccineCount addVaccine(@RequestBody VaccineCount vaccineCount) {
		vaccineCountSrevice.addVaccineCount(vaccineCount);
		return null;

	}

}
