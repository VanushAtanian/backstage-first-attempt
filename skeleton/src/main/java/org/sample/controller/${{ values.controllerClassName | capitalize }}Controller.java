package org.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/${{values.mappingTemplate}}")
public class ${{ values.controllerClassBaseName | capitalize }}Controller {

    @GetMapping
    public Map<String, String> get${{ values.getMethodBaseName | capitalize }}() {
        Map<String, String> jsonMap = new HashMap<>();
        jsonMap.put("${{values.key1}}", "${{values.value1}}");
        jsonMap.put("${{values.key2}}", "${{values.value2}}");
        jsonMap.put("${{values.key3}}", "${{values.value3}}");
        return jsonMap;
    }
}