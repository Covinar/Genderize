package org.example.domain.usecase;

import org.example.domain.entitiy.GenderEntity;

public interface GetGenderUseCase {
    GenderEntity getGender(String name);
}
