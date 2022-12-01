package org.example;

import org.example.data.datasource.remote.GenderRemoteDataSource;
import org.example.data.datasource.remote.GenderRemoteDataSourceImpl;
import org.example.data.datasource.remote.api.ApiService;
import org.example.data.datasource.remote.api.RetrofitClient;
import org.example.data.datasource.remote.mapper.GenderMapper;
import org.example.data.repository.GenderRepository;
import org.example.data.repository.GenderRepositoryImpl;
import org.example.domain.usecase.GetGenderUseCase;
import org.example.domain.usecase.GetGenderUseCaseImpl;
import org.example.presentation.GenderScreen;

public class Application {
    public static void main(String[] args) {
        ApiService apiService = RetrofitClient.getClient().create(ApiService.class);
        GenderMapper mapper = new GenderMapper();
        GenderRemoteDataSource remoteDataSource = new GenderRemoteDataSourceImpl(apiService);
        GenderRepository repository = new GenderRepositoryImpl(remoteDataSource,mapper);
        GetGenderUseCase useCase = new GetGenderUseCaseImpl(repository);
        GenderScreen screen = new GenderScreen(useCase);
        screen.start();
    }
}