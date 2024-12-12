package com.cinenexa.cinenexabackend.controller;

import com.cinenexa.cinenexabackend.payload.ExtensionDTO;
import com.cinenexa.cinenexabackend.service.ExtensionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/extensions")
public class ExtensionController{

    private ExtensionService extensionService;

    @GetMapping()
    public ResponseEntity<List<ExtensionDTO>> getExtensions() {
        List<ExtensionDTO> extensionDTOList = extensionService.getAllExtensions();
        return ResponseEntity.ok().body(extensionDTOList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExtensionDTO> getExtensionById(@PathVariable Long id) {
        ExtensionDTO extensionDTO = extensionService.getExtensionById(id);
        return ResponseEntity.ok().body(extensionDTO);
    }
}
