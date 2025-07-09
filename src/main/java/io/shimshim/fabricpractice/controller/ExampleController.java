package io.shimshim.fabricpractice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import io.shimshim.fabricpractice.dto.RayClusterRequest;
import io.shimshim.fabricpractice.dto.ServeConfigV2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/example")
public class ExampleController {

    private final ObjectMapper objectMapper;
    private final YAMLMapper yamlMapper;

    public ExampleController() {
        this.objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        this.yamlMapper = new YAMLMapper();
    }

    @PostMapping
    public String echoPrettyRequest(@RequestBody ServeConfigV2 request) {
        try {
            // Request 객체를 예쁘게 문자열로 변환
            return objectMapper.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            return "Error converting request to JSON: " + e.getMessage();
        }
    }
}
