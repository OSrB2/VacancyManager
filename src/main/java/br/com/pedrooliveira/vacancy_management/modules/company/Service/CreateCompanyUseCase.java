package br.com.pedrooliveira.vacancy_management.modules.company.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedrooliveira.vacancy_management.exceptions.UserFoundException;
import br.com.pedrooliveira.vacancy_management.modules.company.model.CompanyEntity;
import br.com.pedrooliveira.vacancy_management.modules.company.repository.CompanyRespository;

@Service
public class CreateCompanyUseCase {

  @Autowired
  private CompanyRespository companyRespository;
  
  public CompanyEntity execute(CompanyEntity companyEntity) {
    this.companyRespository.findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
    .ifPresent((user) -> {
      throw new UserFoundException();
    });

    return this.companyRespository.save(companyEntity);
  }
  
}
