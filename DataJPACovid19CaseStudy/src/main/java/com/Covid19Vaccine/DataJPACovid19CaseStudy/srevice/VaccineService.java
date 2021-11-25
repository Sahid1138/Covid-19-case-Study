package com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice;

import java.util.List;

import org.springframework.stereotype.Component;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Vaccine;

@Component
public interface VaccineService {


	public Vaccine findByVaccineId(Integer vaccineId);

	public Vaccine addVaccine(Vaccine vaccine);

	public Vaccine updateVaccine(Vaccine vaccine);

	public void deleteVaccineById(Integer vaccineId);
	
	public List<Vaccine> getAllVaccine();
}
