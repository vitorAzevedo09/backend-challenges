package com.amedigital.challengeramedigital.api.assembler;

import org.springframework.stereotype.Component;

import com.amedigital.challengeramedigital.api.dto.PlanetWithID;
import com.amedigital.challengeramedigital.api.dto.PlanetWithoutID;
import com.amedigital.challengeramedigital.domain.model.Planet;

/**
 * Assembles Planet DTOs and entities.
 */
@Component
public class PlanetAssembler {

        /**
         * Converts a {@link Planet} entity to a {@link PlanetWithID} DTO.
         * 
         * @param entity the planet entity to convert.
         * @return the converted planet DTO.
         */
        public PlanetWithID toDto(Planet entity) {
                return new PlanetWithID(
                                entity.getID(),
                                entity.getName(),
                                entity.getClimate(),
                                entity.getTerrain(),
                                entity.getFilmAppearances());
        }

        /**
         * Converts a {@link PlanetWithoutID} DTO to a {@link Planet} entity.
         * 
         * @param dto the planet DTO to convert.
         * @return the converted planet entity.
         */
        public Planet toEntity(PlanetWithoutID dto) {
                return new Planet.Builder()
                                .name(dto.name())
                                .climate(dto.climate())
                                .terrain(dto.terrain())
                                .filmAppearances(dto.filmAppearances())
                                .build();
        }

}
