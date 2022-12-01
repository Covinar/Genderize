package org.example.data.repository;

import org.example.data.datasource.dto.GenderDto;
import org.example.data.datasource.remote.GenderRemoteDataSource;
import org.example.data.datasource.remote.mapper.GenderMapper;
import org.example.domain.entitiy.GenderEntity;

public class GenderRepositoryImpl implements GenderRepository{
    private final GenderRemoteDataSource remoteDataSource;
    private final GenderMapper mapper;

    public GenderRepositoryImpl(GenderRemoteDataSource remoteDataSource, GenderMapper mapper) {
        this.remoteDataSource = remoteDataSource;
        this.mapper = mapper;
    }

    @Override
    public GenderEntity getGender(String name) {
        GenderDto dto = remoteDataSource.getGender(name);
        return mapper.map(dto);
    }
}
