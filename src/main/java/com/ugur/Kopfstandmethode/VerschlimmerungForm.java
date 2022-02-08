package com.ugur.Kopfstandmethode;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerschlimmerungForm {
    private String verschlimmerungForm;
    private int indexOfProblem;

    @Override
    public String toString() {
        return "VerschlimmerungForm{" +
                "verschlimmerungForm='" + verschlimmerungForm + '\'' +
                ", indexOfProblem=" + indexOfProblem +
                '}';
    }
}
