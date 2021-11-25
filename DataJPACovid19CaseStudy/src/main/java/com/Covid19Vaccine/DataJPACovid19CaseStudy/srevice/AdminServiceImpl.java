package com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Admin;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.exception.AllException;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.repository.AdminRepository;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public Admin insertAdmin(Admin admin) {
		if (admin.getAdminId() == 0 || admin.getPassword().isEmpty() || admin.getUsername().isEmpty()) {
			throw new AllException("Please give proper details : Entity is Blank");
		}
		try {

			return adminRepository.save(admin);
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give proper name of entity : " + e.getMessage());
		} catch (Exception e) {
			throw new AllException("Something went wong : " + e.getMessage());
		}
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		if (admin.getAdminId() == 0 || admin.getPassword().isEmpty() || admin.getUsername().isEmpty()) {
			throw new AllException("Please give proper details : Entity is Blank");
		}
		try {
			return adminRepository.save(admin);
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give Prper Entity,It is invalid : " + e.getMessage());
		} catch (Exception e) {
			throw new AllException("Something went wong : " + e.getMessage());
		}
	}

	@Override
	public void deleteById(int id) {
		try {
			adminRepository.deleteById(id);
		} catch (IllegalArgumentException e) {
			throw new AllException("Please give proper name id" + e.getMessage());
		} catch (Exception e) {
			throw new AllException("invalid Admin ID");
		}

	}

	@Override
	public List<Admin> getAdmin() {
		List<Admin> list = adminRepository.findAll();
		if (list.isEmpty()) {
			throw new AllException("Hey List is empty, we do not have data in database");
		}
		try {
			return list;
		} catch (Exception e) {
			throw new AllException("Something went wrong :" + e.getMessage());
		}
	}

}
