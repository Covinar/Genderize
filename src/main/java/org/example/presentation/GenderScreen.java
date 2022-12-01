package org.example.presentation;

import org.example.domain.usecase.GetGenderUseCase;

import javax.xml.namespace.QName;

public class GenderScreen {
    private final GetGenderUseCase useCase;

    public GenderScreen(GetGenderUseCase useCase) {
        this.useCase = useCase;
    }
    public void start(){
        System.out.println(useCase.getGender("scott"));
    }
}
