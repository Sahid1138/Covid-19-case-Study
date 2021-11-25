package com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.VaccineCount;

@Component
public interface VaccineCountService {

	public VaccineCount addVaccineCount(VaccineCount vaccineCount);

	public List<VaccineCount> getAllVaccine();

	public VaccineCount getQuantity(Integer quantity);

	public VaccineCount getPrice(Integer price);

}
