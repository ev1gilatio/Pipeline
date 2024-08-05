package ru.evig.pipeline.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.evig.pipeline.service.PipeService;

@RestController
@RequiredArgsConstructor
public class PipeController {
    private final PipeService service;

    @GetMapping("/pipe")
    private String pipeFunc() {

        return service.pipeFunc();
    }
}
