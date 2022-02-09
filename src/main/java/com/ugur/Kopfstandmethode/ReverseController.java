package com.ugur.Kopfstandmethode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReverseController {
    public static List<LosungForm> losungFormList = new ArrayList<>();
    //    public static List<ProblemForm> problemFormList = new ArrayList<>();
    public static List<VerschlimmerungForm> verschlimmerungFormList = new ArrayList<>();

    private String problem;

    @GetMapping("/")
    public String getProblemForm(Model model) {
        model.addAttribute("saveProblemForm", new ProblemForm());
        return "problemForm";
    }

    @PostMapping("/saveProblemForm")
    public String saveProblemForm(Model model, String problemForm) {
        model.addAttribute("saveProblemForm", new ProblemForm());
        problem = problemForm;
        return "problemForm";
    }

    @GetMapping("/verschlimm")
    public String getVerschlimmerungForm(Model model) {
        model.addAttribute("saveVerschlimmerungForm", new VerschlimmerungForm());
        model.addAttribute("problem", problem);
        return "verschlimmerungForm";
    }

    @PostMapping("/verschlimm")
    public String saveVerschlimmerungForm(Model model, VerschlimmerungForm verschlimmerungForm, ProblemForm problemForm) {
        model.addAttribute("saveVerschlimmerungForm", new VerschlimmerungForm());
        model.addAttribute("problemForm", problemForm);
        verschlimmerungFormList.add(verschlimmerungForm);

        return "verschlimmerungForm";
    }

    @GetMapping("/losung")
    public String getLosungForm(Model model, VerschlimmerungForm verschlimmerungForm ) {
        model.addAttribute("verschlimmerungFormList", verschlimmerungFormList);
        model.addAttribute("saveLosungForm", new LosungForm());
model.addAttribute("verschlimmerungForm", verschlimmerungForm);
        //     problemFormList.get(verschlimmerungForm.getIndexOfProblem()).getVerschlimm().add(verschlimmerungForm);
        return "losungForm";
    }

    @PostMapping("/losung")
    public String getLosungForm(Model model, LosungForm losungForm) {
        model.addAttribute("saveLosungForm", new LosungForm());
        System.out.println(losungForm);
        return "losungForm";
    }


}
