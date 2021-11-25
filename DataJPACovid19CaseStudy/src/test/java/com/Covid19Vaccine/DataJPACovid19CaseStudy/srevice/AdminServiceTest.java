package com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Admin;

@SpringBootTest
class AdminServiceTest {

	@Autowired
	private AdminService adminService;

	@Test
	public void addAdmin() {
		Admin amdin = new Admin(10, "abdus", "sahid", "assahid1997", "assahid1997");
	}

	@Test
	public void insertAdmin() {
		Admin admin = new Admin(20, "asdfg", "zxcvvbn", "abcdef", "abcdef");
		adminService.insertAdmin(admin);
	}
	@Test
	public void getAdmin() {
		List<Admin> admin=adminService.getAdmin();
	}
	@Test
	public void deleteById() {
		adminService.deleteById(3);

	}
}
