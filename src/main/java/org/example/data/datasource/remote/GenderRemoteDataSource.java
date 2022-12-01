package org.example.data.datasource.remote;

import org.example.data.datasource.dto.GenderDto;

public interface GenderRemoteDataSource {
    GenderDto getGender(String name);
}
