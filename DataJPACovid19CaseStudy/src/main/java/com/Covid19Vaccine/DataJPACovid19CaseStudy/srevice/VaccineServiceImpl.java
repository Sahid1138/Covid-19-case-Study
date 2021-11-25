package com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Vaccine;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.exception.AllException;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.repository.VaccineRepository;

@Service
public class VaccineServiceImpl implements VaccineService {

	@Autowired
	public VaccineRepository vaccineRepository;

	public Vaccine addVaccine(Vaccine vaccine) {
		if (vaccine.getVaccineId() == 0 || vaccine.getVaccineName().isEmpty() || vaccine.getDescription().isEmpty()) {
			throw new AllException("Fill all the credential");
		}
		try {
			vaccine = vaccineRepository.save(vaccine);
			return vaccine;
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give proper data" + e.getMessage());
		} catch (Exception e) {
			throw new AllException("Something went wrong" + e.getMessage());
		}

	}

	public Vaccine findByVaccineId(Integer vaccineId) {
		try {
			return vaccineRepository.findById(vaccineId).get();
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give proper vaccine id" + e.getMessage());
		} catch (Exception e) {
			throw new AllException("invalid vaccine ID");
		}
	}

	public Vaccine updateVaccine(Vaccine vaccine) {
		if (vaccine.getVaccineId() == 0 || vaccine.getVaccineName().isEmpty() || vaccine.getDescription().isEmpty()) {
			throw new AllException("Fill all the credential");
		}
		try {
			vaccine = vaccineRepository.save(vaccine);
			return vaccine;
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give proper data" + e.getMessage());
		} catch (Exception e) {
			throw new AllException("Something went wrong" + e.getMessage());
		}
	}

	public void deleteVaccineById(Integer vaccineId) {
		try {
			vaccineRepository.deleteById(vaccineId);
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give proper vaccine id" + e.getMessage());
		} catch (Exception e) {
			throw new AllException("invalid vaccine ID");
		}
	}

	@Override
	public List<Vaccine> getAllVaccine() {
		List<Vaccine> vaccine = new ArrayList<Vaccine>();
		vaccineRepository.findAll().forEach(vac -> vaccine.add(vac));
		return vaccine;
	}

}
