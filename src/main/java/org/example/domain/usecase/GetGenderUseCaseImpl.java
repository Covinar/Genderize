package org.example.domain.usecase;

import org.example.data.repository.GenderRepository;
import org.example.domain.entitiy.GenderEntity;

public class GetGenderUseCaseImpl implements GetGenderUseCase {
    private final GenderRepository repository;

    public GetGenderUseCaseImpl(GenderRepository repository) {
        this.repository = repository;
    }

    @Override
    public GenderEntity getGender(String name) {
        return repository.getGender(name);
    }
}
