package com.Covid19Vaccine.DataJPACovid19CaseStudy.srevice;

import java.util.List;

import org.springframework.stereotype.Component;
import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Admin;

@Component
public interface AdminService {

	public Admin insertAdmin(Admin admin);

	public Admin updateAdmin(Admin admin);

	public void deleteById(int id);

	public List<Admin> getAdmin();
}
