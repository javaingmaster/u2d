package com.aj.cardservice.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestControl {
    private static final Logger log = LoggerFactory.getLogger(TestControl.class);

    @GetMapping
    public String test() {
        log.info("test!");
        return "connect!";
    }
}
