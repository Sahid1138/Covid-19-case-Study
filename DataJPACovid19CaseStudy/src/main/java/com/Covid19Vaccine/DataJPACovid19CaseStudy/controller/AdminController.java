package com.Covid19Vaccine.DataJPACovid19CaseStudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Admin;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Vaccine;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.exception.AdminControllerException;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.exception.AllException;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice.AdminService;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice.VaccineService;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;

	@Autowired
	private VaccineService vaccineService;

	@PostMapping("/insert")
	public Admin insertAdmin(@RequestBody Admin admin) {

		return adminService.insertAdmin(admin);
	}

	@PutMapping("/update")
	public Admin updateAdmin(@RequestBody Admin admin) {

		return adminService.updateAdmin(admin);
	}

	@GetMapping("/view")
	public List<Admin> getAdmin() {

		return adminService.getAdmin();

	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {

		adminService.deleteById(id);
	}

	@PostMapping("/adminvaccineadd")
	private Vaccine addVaccine(@RequestBody Vaccine vaccine) {
		return vaccineService.addVaccine(vaccine);

	}

	@PutMapping("/adminvaccineupdate")
	private Vaccine updateVaccine(@RequestBody Vaccine vaccine) {
		return vaccineService.updateVaccine(vaccine);

	}

	@DeleteMapping("/adminvaccinedelete/{vaccineId}")
	private void deleteVaccine(@PathVariable Integer vaccineId) {
		vaccineService.deleteVaccineById(vaccineId);

	}

	@GetMapping("/adminvaccines")
	private List<Vaccine> getAllVaccine() {
		return vaccineService.getAllVaccine();
	}

	@GetMapping("/adminvaccines/{vaccineId}")
	private Vaccine findByVaccineId(@PathVariable Integer vaccineId) {
		return vaccineService.findByVaccineId(vaccineId);
	}
}
