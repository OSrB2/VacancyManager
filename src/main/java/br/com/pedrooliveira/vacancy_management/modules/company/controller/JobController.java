package br.com.pedrooliveira.vacancy_management.modules.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedrooliveira.vacancy_management.modules.company.Service.CreateJobUseCase;
import br.com.pedrooliveira.vacancy_management.modules.company.model.JobEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/company/job/")
public class JobController {
  
  @Autowired
  private CreateJobUseCase createJobUseCase;

  @PostMapping
  public JobEntity create(@Valid @RequestBody JobEntity jobEntity) {
    return this.createJobUseCase.execute(jobEntity);
  }
}
