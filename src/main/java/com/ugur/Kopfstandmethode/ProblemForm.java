package com.ugur.Kopfstandmethode;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProblemForm {
    private String problemForm;
    private List<VerschlimmerungForm> verschlimm = new ArrayList<>();
    private List<LosungForm> losungFormList = new ArrayList();

    @Override
    public String toString() {
        return "ProblemForm{" +
                "problemForm='" + problemForm + '\'' +
                ", verschlimm=" + verschlimm +
                ", losungFormList=" + losungFormList +
                '}';
    }
}
