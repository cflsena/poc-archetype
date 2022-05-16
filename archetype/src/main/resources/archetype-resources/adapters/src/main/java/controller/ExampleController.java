#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ${package}.api.ExampleApiContract;
import ${package}.application.port.in.ExampleServicePort;
import ${package}.db.repository.PersonSpringDataJPARepository;

@RequestMapping("persons")
@RestController
@RequiredArgsConstructor
@Tag(name = "Pessoas", description = "API para cadastro de pessoas")
public class ExampleController implements ExampleApiContract {

    private final ExampleServicePort personServicePort;
    private final PersonSpringDataJPARepository repository;

}
