package com.ohgiraffers.restapi.responseentity.service;

import com.ohgiraffers.restapi.responseentity.dto.PokemonDTO;
import com.ohgiraffers.restapi.responseentity.repository.PokemonRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private final PokemonRepository menuRepository;
    private final ModelMapper modelMapper;
    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository menuRepository, ModelMapper modelMapper, PokemonRepository pokemonRepository) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
        this.pokemonRepository = pokemonRepository;
    }




    public void registNewPokemon(PokemonDTO pokemonDTO) {

        // 저장


    }

    public <pokemonCode> PokemonDTO findPokemonByCode(int PokemonCode) {

        Integer pokemonCode;
        pokemonCode pokemon = (pokemonCode) pokemonRepository.findById(PokemonCode);

        return null;
    }









    /**
     * pokemon 정보를 받아서 Pokemon Entity 로 만들고
     * Pokemon Entity 객체를 데이터베이스에 저장
     */


}

