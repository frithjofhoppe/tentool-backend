package com.hofr.tentoolbackend.business.service;

import com.hofr.tentoolbackend.business.dto.AdaDto;

import java.util.List;

public interface AdaService {
    public AdaDto createAda(AdaDto adaDto);
    public List<AdaDto> getAllAda();
}
