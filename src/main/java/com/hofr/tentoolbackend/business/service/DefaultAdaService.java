package com.hofr.tentoolbackend.business.service;

import com.hofr.tentoolbackend.business.dto.AdaDto;
import com.hofr.tentoolbackend.database.repository.AdaRepository;
import com.hofr.tentoolbackend.utility.AdaMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class DefaultAdaService implements AdaService{

    private AdaRepository adaRepository;

    public DefaultAdaService(AdaRepository adaRepository) {
        this.adaRepository = adaRepository;
    }

    @Override
    public AdaDto createAda(AdaDto adaDto) {
        var mappedAda = AdaMapper.toDao(adaDto);
        mappedAda.setId(UUID.randomUUID());
        var ada = adaRepository.save(mappedAda);
        return AdaMapper.toDto(ada);
    }

    @Override
    public List<AdaDto> getAllAda() {
        return adaRepository.findAll()
                .stream().map(AdaMapper::toDto)
                .collect(Collectors.toList());
    }
}
