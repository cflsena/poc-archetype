#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;
import ${package}.db.model.ExampleModel;

import java.util.UUID;

@Repository
public interface PersonSpringDataJPARepository extends JpaRepository<ExampleModel, UUID>, RevisionRepository<ExampleModel, UUID, Long> { }
