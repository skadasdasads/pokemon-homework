package com.ohgiraffers.restapi.responseentity.service;

import com.ohgiraffers.restapi.responseentity.repository.PokemonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private final PokemonRepository menuRepository;
    private final ModelMapper modelMapper;

    public PokemonService(PokemonRepository menuRepository, ModelMapper modelMapper) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
    }
    /**
     * pokemon 정보를 받아서 Pokemon Entity 로 만들고
     * Pokemon Entity 객체를 데이터베이스에 저장
     */

    public PokemonService(PokemonRepository pokemonRepository, ModelMapper modelMapper) {
        this.pokemon
    }
    )


}

