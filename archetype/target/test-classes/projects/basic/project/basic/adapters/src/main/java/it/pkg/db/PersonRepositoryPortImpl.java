package it.pkg.db;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import it.pkg.application.port.out.ExampleRepositoryPort;
import it.pkg.db.repository.PersonSpringDataJPARepository;

@Component
@RequiredArgsConstructor
public class PersonRepositoryPortImpl implements ExampleRepositoryPort {
    private final PersonSpringDataJPARepository repository;
}
