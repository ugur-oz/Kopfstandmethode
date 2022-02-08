package com.ugur.Kopfstandmethode;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LosungForm {
    private String losung;
    private int indexOfVerschlimmerung;

    @Override
    public String toString() {
        return "LosungForm{" +
                "losung='" + losung + '\'' +
                ", indexOfVerschlimmerung=" + indexOfVerschlimmerung +
                '}';
    }
}
