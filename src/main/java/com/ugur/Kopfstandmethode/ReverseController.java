package com.ugur.Kopfstandmethode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReverseController {
    public static List<Losung> losungList = new ArrayList<>();

    @GetMapping("/")
    public String getLosungForm(Model model) {
      model.addAttribute("saveLosungForm",new Losung());
       // losungList.add(new Losung());

        return "losungForm";
    }
    @PostMapping("/saveLosungForm")
    public String saveLosungForm(Model model,Losung losung) {
        model.addAttribute("saveLosungForm",new Losung());
        losungList.add(losung);
        System.out.println(losungList);
        return "losungForm";
    }
}
