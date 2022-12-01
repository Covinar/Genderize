package org.example.data.datasource.remote.mapper;

import org.example.data.datasource.dto.GenderDto;
import org.example.domain.entitiy.GenderEntity;

public class GenderMapper {
    private GenderEntity.Gender gender;
    public GenderEntity map(GenderDto dto){
        GenderEntity.Gender gender;
        if(dto.getGender().equals("Male"))
            gender = GenderEntity.Gender.Male;
        else
            gender = GenderEntity.Gender.Female;
        GenderEntity entity = new GenderEntity(dto.getCount(),
                gender,
                dto.getName(),
                dto.getProbability()
        );
        return entity;
    }
}
