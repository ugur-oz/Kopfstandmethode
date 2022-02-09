package com.ugur.Kopfstandmethode;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProblemForm {
    private String problemForm;

     //private List<VerschlimmerungForm> verschlimm = new ArrayList<>();
     // private List<LosungForm> losungFormList = new ArrayList();

    public String getProblemForm() {
        return problemForm;
    }

    public void setProblemForm(String problemForm) {
        this.problemForm = problemForm;
    }

    @Override
    public String toString() {
        return "ProblemForm{" +
                "problemForm='" + problemForm + '\'' +
                '}';
    }
}
