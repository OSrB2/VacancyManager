package br.com.pedrooliveira.vacancy_management.modules.company.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedrooliveira.vacancy_management.modules.company.model.CompanyEntity;

public interface CompanyRespository extends JpaRepository<CompanyEntity, UUID>{
  Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);
}
