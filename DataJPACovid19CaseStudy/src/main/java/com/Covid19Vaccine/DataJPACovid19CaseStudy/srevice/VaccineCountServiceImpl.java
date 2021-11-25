package com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Vaccine;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.VaccineCount;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.exception.AllException;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.repository.VaccineCountRepository;

@Service("vaccineCountService")
public class VaccineCountServiceImpl implements VaccineCountService {
	@Autowired
	private VaccineCountRepository vaccineCountRepository;

	@Override
	public List<VaccineCount> getAllVaccine() {
		List<VaccineCount> vaccineCount = vaccineCountRepository.findAll();
		if (vaccineCount.isEmpty()) {
			throw new AllException("List is empty!");
		}
		try {
			return vaccineCount;
		} catch (Exception e) {
			throw new AllException("Something went Wrong" + e.getMessage());
		}

	}

	@Override
	public VaccineCount getPrice(Integer price) {
		try {
			return vaccineCountRepository.getById(price);
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give the price" + e.getMessage());
		} catch (Exception e) {
			throw new AllException("Invalid Price");
		}
	}

	@Override
	public VaccineCount getQuantity(Integer quantity) {
		try {
			return vaccineCountRepository.getById(quantity);
		} catch (IllegalArgumentException e) {
			throw new AllException("please give the entity" + e.getMessage());
		} catch (Exception e) {
			throw new AllException("Invalid quantity" + e.getMessage());
		}

	}

	@Override
	public VaccineCount addVaccineCount(VaccineCount vaccineCount) {
		try {
			if (vaccineCount.getQuantity() == 0 || vaccineCount.getPrice() == 0) {
				throw new AllException("Fill all the credential");
			}
			return vaccineCountRepository.save(vaccineCount);
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give proper data" + e.getMessage());
		} catch (Exception e) {
			throw new AllException("Something went wrong" + e.getMessage());
		}
	}

}
