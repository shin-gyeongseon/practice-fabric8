package io.shimshim.fabricpractice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.shimshim.fabricpractice.dto.RayClusterRequest;
import io.shimshim.fabricpractice.dto.ServeConfigV2;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/yaml")
public class YamlController {

    private final YAMLMapper yamlMapper;

    public YamlController() {
        this.yamlMapper = new YAMLMapper();
        this.yamlMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @PostMapping
    public String echoYaml(@RequestBody ServeConfigV2 request) {
        try {
            return yamlMapper.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            return "YAML 변환 중 오류 발생: " + e.getMessage();
        }
    }
}
