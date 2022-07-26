package edu.lion.prj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@Slf4j
@RequestMapping("/boards/*")
@RestController
public class BoardController {

    @GetMapping("/list")
    public String list(){
        log.info("list() ..");
        return "Hello World";
    }
}
