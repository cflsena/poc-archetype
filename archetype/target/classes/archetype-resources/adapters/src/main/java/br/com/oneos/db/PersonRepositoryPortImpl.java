#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package br.com.oneos.db;

import br.com.oneos.application.port.db.out.ExampleRepositoryPort;
import br.com.oneos.db.model.repository.PersonSpringDataJPARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonRepositoryPortImpl implements ExampleRepositoryPort {
    private final PersonSpringDataJPARepository repository;
}
