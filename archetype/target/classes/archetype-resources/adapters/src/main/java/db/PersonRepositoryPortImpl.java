#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.db;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ${package}.application.port.out.ExampleRepositoryPort;
import ${package}.db.repository.PersonSpringDataJPARepository;

@Component
@RequiredArgsConstructor
public class PersonRepositoryPortImpl implements ExampleRepositoryPort {
    private final PersonSpringDataJPARepository repository;
}
