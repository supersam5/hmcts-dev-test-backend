package uk.gov.hmcts.reform.dev.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.gov.hmcts.reform.dev.models.Case;



import static org.springframework.http.ResponseEntity.ok;

@RestController
public class CaseController {

    @GetMapping(value = "/api/cases/all", produces = "application/json")
    public ResponseEntity<Case> getAllCases() {
        Case case1 = new Case();
        return ok(case1);
    }

    @GetMapping (value = "api/cases/:id", produces = "application/json")
    public ResponseEntity<Case> getCase() {
        Case casebyID = new Case();
        return ok(casebyID);
    }

    @PostMapping (value = "api/cases/new", produces = "application/json")
    public ResponseEntity<Case> addCase() {
        Case newCase = new Case();
        return ok(newCase);
    }

    @PostMapping (value = "api/cases/update", produces = "application/json")
    public ResponseEntity<Case> updateCase() {
        Case updatedCase = new Case();
        return ok(updatedCase);
    }

    @DeleteMapping(value = "api/cases/:id", produces = "application/json")
    public ResponseEntity deleteCase() {
        Case updatedCase = new Case();
        return ok(updatedCase);
    }

}
