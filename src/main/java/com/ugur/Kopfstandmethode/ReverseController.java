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
    public static List<ProblemForm> problemFormList = new ArrayList<>();
    public static List<VerschlimmerungForm> verschlimmerungFormList = new ArrayList<>();

    @GetMapping("/")
    public String getProblemForm(Model model) {
        model.addAttribute("saveProblemForm", new ProblemForm());
        return "problemForm";
    }

    @PostMapping("/saveProblemForm")
    public String saveProblemForm(Model model, ProblemForm problemForm) {
        model.addAttribute("saveProblemForm", new ProblemForm());
        problemFormList.add(problemForm);
        System.out.println(problemFormList);
        return "problemForm";
    }

    @GetMapping("/verschlimm")
    public String getVerschlimmerungForm(Model model) {
        model.addAttribute("saveVerschlimmerungForm", new VerschlimmerungForm());
        model.addAttribute("problemFormList", problemFormList);
        return "verschlimmerungForm";
    }

    @PostMapping("/verschlimm")
    public String saveVerschlimmerungForm(Model model, VerschlimmerungForm verschlimmerungForm,ProblemForm problemForm) {
        model.addAttribute("saveVerschlimmerungForm", new VerschlimmerungForm());
        model.addAttribute("problemFormList", problemFormList);
        model.addAttribute("problemForm",problemForm);
        verschlimmerungFormList.add(verschlimmerungForm);
        problemFormList.get(verschlimmerungForm.getIndexOfProblem()).getVerschlimm().add(verschlimmerungForm);
        System.out.println(verschlimmerungFormList);
        System.out.println(problemFormList);
        return "verschlimmerungForm";
    }

    @GetMapping("/losung")
    public String getLosungForm(Model model) {
        model.addAttribute("saveLosungForm", new LosungForm());
        return "losungForm";
    }

    @PostMapping("/losung")
    public String getLosungForm(Model model, LosungForm losungForm ) {
        model.addAttribute("saveLosungForm", new LosungForm());
        return "losungForm";
    }


}
