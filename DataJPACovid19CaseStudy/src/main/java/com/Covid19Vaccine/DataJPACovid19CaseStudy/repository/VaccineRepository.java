package com.Covid19Vaccine.DataJPACovid19CaseStudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Covid19Vaccine.DataJPACovid19CaseStudy.entity.Vaccine;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, Integer> {

}
