package uk.gov.hmcts.reform.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uk.gov.hmcts.reform.dev.models.Case;


public interface CaseRepository extends JpaRepository<Case, Integer> {
    // Basic CRUD operations are automatically provided by JpaRepository
    // You can add custom query methods here if needed
}
