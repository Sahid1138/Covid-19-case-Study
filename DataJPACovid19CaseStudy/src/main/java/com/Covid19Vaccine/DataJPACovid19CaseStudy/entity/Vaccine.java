package com.Covid19Vaccine.DataJPACovid19CaseStudy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Vaccine {

	@Id
	private int vaccineId;
	private String vaccineName;
	private String description;

	public Vaccine(int vaccineId, String vaccineName, String description) {
		super();
		this.vaccineId = vaccineId;
		this.vaccineName = vaccineName;
		this.description = description;
	}

	public Vaccine() {
		super();

	}

	@Override
	public String toString() {
		return "Vaccine [vaccineId=" + vaccineId + ", vaccineName=" + vaccineName + ", description=" + description
				+ "]";
	}

	public int getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
