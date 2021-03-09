package com.tts.deplomentdemo.controller;

import com.tts.deplomentdemo.model.Television;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/television")
public class TelevisionController {

    @GetMapping("/get")
    public Television getTelevision() {
        return new Television(1L, "2140p", "55", "XR35","Sony");
    }
}
