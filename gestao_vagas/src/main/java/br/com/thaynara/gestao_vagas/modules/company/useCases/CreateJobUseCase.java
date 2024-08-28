package br.com.thaynara.gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.thaynara.gestao_vagas.modules.company.entities.JobEntity;
import br.com.thaynara.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class CreateJobUseCase {
    
    @Autowired
    private JobRepository jobRepository;

    public void execute(JobEntity jobEntity){
        return this.jobRepository.save(jobEntity);
    }
}
