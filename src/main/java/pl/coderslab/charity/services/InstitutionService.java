package pl.coderslab.charity.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class InstitutionService {

    InstitutionRepository institutionRepository;


    public List<Institution> getAllInstitutions(){
        return institutionRepository.findAll();
    }
}
