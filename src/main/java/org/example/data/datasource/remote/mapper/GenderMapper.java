package org.example.data.datasource.remote.mapper;

import org.example.data.datasource.dto.GenderDto;
import org.example.domain.entitiy.GenderEntity;

public class GenderMapper {
    public GenderEntity map(GenderDto dto){
        GenderEntity entity = new GenderEntity(dto.getCount(),
                dto.getGender(),
                dto.getName(),
                dto.getProbability()
        );
        return entity;
    }
}
