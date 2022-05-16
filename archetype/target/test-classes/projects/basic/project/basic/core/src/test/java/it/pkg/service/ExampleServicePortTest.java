package it.pkg.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import it.pkg.application.port.out.ExampleRepositoryPort;
import it.pkg.application.service.ExampleServicePortImpl;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
@DisplayName("Test for Example Service Port")
class ExampleServicePortTest {

    @InjectMocks
    private ExampleServicePortImpl exampleServicePort;

    @Mock
    private ExampleRepositoryPort exampleRepositoryPort;

    @Test
    @DisplayName("Create your unit test for this service")
    void test01() {
        assertTrue(true);
    }

}