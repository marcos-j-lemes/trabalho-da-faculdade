package ifsc.edu.artigos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
@RequestMapping("/api/v1")
public class ControllerArtigos {

    @GetMapping("/run")
    public final String testeRun() {
        String statusResponse = "{\"Status\":\"Api running successfully\", \"Test\":\"My applications is runing with devoolss\"}";
        return statusResponse;
    }
}
