package org.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dummy")
public class FirstattemptController {

    @GetMapping
    public Map<String, String> get() {
        Map<String, String> jsonMap = new HashMap<>();
        jsonMap.put("default_key1", "default_value1");
        jsonMap.put("default_key2", "default_value2");
        jsonMap.put("default_key3", "default_value3");
        return jsonMap;
    }
}