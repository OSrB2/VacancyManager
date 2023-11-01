package br.com.pedrooliveira.vacancy_management.modules.candidate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pedrooliveira.vacancy_management.exceptions.UserFoundException;
import br.com.pedrooliveira.vacancy_management.modules.candidate.model.CandidateEntity;
import br.com.pedrooliveira.vacancy_management.modules.candidate.repository.CandidateRepository;

@Service
public class CreateCandidateUseCase {

  @Autowired
  private CandidateRepository candidateRepository;
  
  public CandidateEntity execute(CandidateEntity candidateEntity) {
     this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
    .ifPresent((user) -> {
      throw new UserFoundException();
    });

    return this.candidateRepository.save(candidateEntity);
  }
}
