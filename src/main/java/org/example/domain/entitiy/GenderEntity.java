package org.example.domain.entitiy;

public class GenderEntity {
    private final int count;
    private final Gender gender;
    private final String name;
    private final double probability;

    public GenderEntity(int count, Gender gender, String name, double probability) {
        this.count = count;
        this.gender = gender;
        this.name = name;
        this.probability = probability;
    }

    public enum Gender{
        Male, Female
    }

    @Override
    public String toString() {
        return "GenderEntity{" +
                "count=" + count +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", probability=" + probability +
                '}';
    }
}
