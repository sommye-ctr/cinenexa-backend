package com.cinenexa.cinenexabackend.service;

import com.cinenexa.cinenexabackend.payload.ExtensionDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExtensionService {
    List<ExtensionDTO> getAllExtensions();

    ExtensionDTO getExtensionById(Long id);
}
