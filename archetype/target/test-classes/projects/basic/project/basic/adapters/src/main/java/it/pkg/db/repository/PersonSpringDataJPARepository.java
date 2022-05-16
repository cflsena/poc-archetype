package it.pkg.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;
import it.pkg.db.model.ExampleModel;

import java.util.UUID;

@Repository
public interface PersonSpringDataJPARepository extends JpaRepository<ExampleModel, UUID>, RevisionRepository<ExampleModel, UUID, Long> { }
