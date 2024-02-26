package com.amedigital.challengeramedigital.api.assembler;

import org.springframework.stereotype.Component;

import com.amedigital.challengeramedigital.api.dto.PlanetWithID;
import com.amedigital.challengeramedigital.domain.model.Planet;

/**
 * PlanetAssembler
 */
@Component
public class PlanetAssembler {

    public PlanetWithID toDto(Planet entity) {
        return new PlanetWithID(
                entity.getID(),
                entity.getName(),
                entity.getWeather(),
                entity.getTerrain(),
                entity.getFilmAppearances());
    }

}
