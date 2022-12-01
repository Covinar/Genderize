package org.example.data.datasource.remote.api;

import org.example.data.datasource.dto.GenderDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("/{name}")
    Call<GenderDto> getGender(@Path(value = "name", encoded = true) String name);
}
