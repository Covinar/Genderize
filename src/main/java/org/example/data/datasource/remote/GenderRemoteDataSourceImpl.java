package org.example.data.datasource.remote;

import org.example.data.datasource.dto.GenderDto;
import org.example.data.datasource.remote.api.ApiService;
import org.example.data.datasource.remote.mapper.GenderMapper;

import java.io.IOException;

public class GenderRemoteDataSourceImpl implements GenderRemoteDataSource{
    private final ApiService apiService;

    public GenderRemoteDataSourceImpl(ApiService apiService) {
        this.apiService = apiService;
    }

    @Override
    public GenderDto getGender(String name) {
        GenderDto dto = null;
        try {
            dto = apiService.getGender(name).execute().body();
            return dto;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
