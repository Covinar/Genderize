package org.example.data.datasource.remote.api;

import org.example.data.datasource.dto.GenderDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    @GET("")
    Call<GenderDto> getGender(@Query(value = "name", encoded = true) String name);
}
