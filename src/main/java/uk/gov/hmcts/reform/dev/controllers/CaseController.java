package uk.gov.hmcts.reform.dev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import uk.gov.hmcts.reform.dev.models.Case;
import uk.gov.hmcts.reform.dev.services.CaseService;
import java.util.List;



@RestController
public class CaseController {
    @Autowired
    CaseService caseService;

    @GetMapping(value = "/api/cases/all", produces = "application/json")
    public ResponseEntity<List<Case>> getAllCases() {
        return ResponseEntity.ok(caseService.getAllCases());
    }

    @GetMapping(value = "api/cases/{id}", produces = "application/json")
    public ResponseEntity<Case> getCase(@PathVariable Integer id) {
        return caseService.getCaseById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "api/cases/new", produces = "application/json")
    public ResponseEntity<Case> addCase(@RequestBody Case newCase) {
        return ResponseEntity.ok(caseService.createCase(newCase));
    }

    @PostMapping(value = "api/cases/update", produces = "application/json")
    public ResponseEntity<Case> updateCase(@RequestBody Case caseToUpdate) {
        return ResponseEntity.ok(caseService.updateCase(caseToUpdate));
    }

    @DeleteMapping(value = "api/cases/{id}", produces = "application/json")
    public ResponseEntity<Void> deleteCase(@PathVariable Integer id) {
        caseService.deleteCase(id);
        return ResponseEntity.ok().build();
    }
}
