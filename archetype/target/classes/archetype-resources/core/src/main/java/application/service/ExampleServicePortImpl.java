#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.application.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ${package}.application.port.in.ExampleServicePort;
import ${package}.application.port.out.ExampleRepositoryPort;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
@Slf4j
public class ExampleServicePortImpl implements ExampleServicePort {
    private final ExampleRepositoryPort exampleRepositoryPort;
}
