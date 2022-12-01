package org.example.data.datasource.dto;

import org.example.domain.entitiy.GenderEntity;

public class GenderDto {
    private int count;
    private GenderEntity.Gender gender;
    private String name;
    private double probability;

    public int getCount() {
        return count;
    }

    public GenderEntity.Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public double getProbability() {
        return probability;
    }
}
