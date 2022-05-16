package it.pkg.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.pkg.api.ExampleApiContract;
import it.pkg.application.port.in.ExampleServicePort;
import it.pkg.db.repository.PersonSpringDataJPARepository;

@RequestMapping("persons")
@RestController
@RequiredArgsConstructor
@Tag(name = "Pessoas", description = "API para cadastro de pessoas")
public class ExampleController implements ExampleApiContract {

    private final ExampleServicePort personServicePort;
    private final PersonSpringDataJPARepository repository;

}
