package com.hofr.tentoolbackend.web;

import com.hofr.tentoolbackend.business.dto.AdaDto;
import com.hofr.tentoolbackend.business.service.AdaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ada")
public class AdaController {

    private AdaService adaService;

    public AdaController(AdaService adaService) {
        this.adaService = adaService;
    }

    @PostMapping
    public AdaDto createAda(@RequestBody AdaDto adaDto) {
        return adaService.createAda(adaDto);
    }

    @GetMapping
    public List<AdaDto> getAdas() {
        return adaService.getAllAda();
    }
}
