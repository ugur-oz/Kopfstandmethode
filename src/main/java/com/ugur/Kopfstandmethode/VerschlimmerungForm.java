package com.ugur.Kopfstandmethode;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class VerschlimmerungForm {
    private String verschlimmerungForm;
    private List<LosungForm> losungen = new ArrayList<>();

    @Override
    public String toString() {
        return "VerschlimmerungForm{" +
                "verschlimmerungForm='" + verschlimmerungForm + '\'' +
                ", losungen=" + losungen +
                '}';
    }

    public String getVerschlimmerungForm() {
        return verschlimmerungForm;
    }

    public void setVerschlimmerungForm(String verschlimmerungForm) {
        this.verschlimmerungForm = verschlimmerungForm;
    }
}
