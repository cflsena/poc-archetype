package it.pkg.application.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import it.pkg.application.port.in.ExampleServicePort;
import it.pkg.application.port.out.ExampleRepositoryPort;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
@Slf4j
public class ExampleServicePortImpl implements ExampleServicePort {
    private final ExampleRepositoryPort exampleRepositoryPort;
}
