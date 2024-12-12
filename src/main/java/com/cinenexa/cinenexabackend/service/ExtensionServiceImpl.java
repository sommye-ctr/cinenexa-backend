package com.cinenexa.cinenexabackend.service;

import com.cinenexa.cinenexabackend.exception.ResourceNotFoundException;
import com.cinenexa.cinenexabackend.models.Extension;
import com.cinenexa.cinenexabackend.payload.ExtensionDTO;
import com.cinenexa.cinenexabackend.repositories.ExtensionRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@AllArgsConstructor
public class ExtensionServiceImpl implements ExtensionService {

    private ExtensionRepository extensionRepository;
    private ModelMapper modelMapper;

    @Override
    public List<ExtensionDTO> getAllExtensions() {
        List<Extension> extensions = extensionRepository.findAll();

        return extensions.stream().map(
                c -> modelMapper.map(c, ExtensionDTO.class)
        ).toList();
    }

    @Override
    public ExtensionDTO getExtensionById(Long id) {
        Extension extension = extensionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Extension", id));
        return modelMapper.map(extension, ExtensionDTO.class);
    }
}
