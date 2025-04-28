package uk.gov.hmcts.reform.dev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.gov.hmcts.reform.dev.models.Case;
import uk.gov.hmcts.reform.dev.repositories.CaseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CaseService {

    @Autowired
    CaseRepository caseRepository;

    public List<Case> getAllCases() {
        return caseRepository.findAll();
    }

    public Optional<Case> getCaseById(Integer id) {
        return caseRepository.findById(id);
    }

    public Case createCase(Case newCase) {
        return caseRepository.save(newCase);
    }

    public Case updateCase(Case caseToUpdate) {
        return caseRepository.save(caseToUpdate);
    }

    public void deleteCase(Integer id) {
        caseRepository.deleteById(id);
    }
}
