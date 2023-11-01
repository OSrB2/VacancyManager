package br.com.pedrooliveira.vacancy_management.modules.company.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedrooliveira.vacancy_management.modules.company.model.JobEntity;
import br.com.pedrooliveira.vacancy_management.modules.company.repository.JobRepository;

@Service
public class CreateJobUseCase {

  @Autowired
  private JobRepository jobRepository;
  
  public JobEntity execute(JobEntity jobEntity) {
    return this.jobRepository.save(jobEntity);
  }
}
