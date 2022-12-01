package org.example.data.repository;

import org.example.domain.entitiy.GenderEntity;

public interface GenderRepository {
    GenderEntity getGender(String name);
}
