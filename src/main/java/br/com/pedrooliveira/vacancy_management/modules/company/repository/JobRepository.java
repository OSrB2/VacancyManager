package br.com.pedrooliveira.vacancy_management.modules.company.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedrooliveira.vacancy_management.modules.company.model.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, UUID>{
  
}
