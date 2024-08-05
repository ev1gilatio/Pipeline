package ru.evig.pipeline.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PipeServiceTest {

    @Autowired
    PipeService service;

    @Test
    void shouldReturnMessage() {
        String message = service.pipeFunc();

        assertEquals(message, "Pipe");
    }
}
