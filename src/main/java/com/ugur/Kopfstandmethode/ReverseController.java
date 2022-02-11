package com.ugur.Kopfstandmethode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReverseController {

    public static List<VerschlimmerungForm> verschlimmerungFormList = new ArrayList<>();
    //    public static List<ProblemForm> problemFormList = new ArrayList<>();
    public static List<LosungForm> losungFormList = new ArrayList<>();

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
        System.out.println(problem);
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
    public String getLosungForm(Model model, VerschlimmerungForm verschlimmerungForm) {
        model.addAttribute("verschlimmerungFormList", verschlimmerungFormList);
        model.addAttribute("saveLosungForm", new LosungForm());
        model.addAttribute("verschlimmerungForm", verschlimmerungForm);


        //     problemFormList.get(verschlimmerungForm.getIndexOfProblem()).getVerschlimm().add(verschlimmerungForm);
        //    verschlimmerungFormList.get(verschlimmerungFormList.getIndexOfVerschlimmerung()).getLosung().add(LosungForm)
        return "losungForm";
    }

    @PostMapping("/losung")
    public String getLosungForm(Model model, LosungForm losungForm) {
        model.addAttribute("verschlimmerungFormList", verschlimmerungFormList);
        model.addAttribute("saveLosungForm", new LosungForm());
        losungFormList.add(losungForm);
        model.addAttribute("losungFormList", losungFormList);
        verschlimmerungFormList.get(losungForm.getIndexOfVerschlimmerung()).getLosungen().add(losungForm);
        // System.out.println(verschlimmerungFormList.get(losungForm.getIndexOfVerschlimmerung()));
        return "losungForm";
    }

    @GetMapping("/ansicht")
    public String showSeite(Model model, LosungForm losungForm) {
        model.addAttribute("verschlimmerungFormList", verschlimmerungFormList);
        model.addAttribute("saveLosungForm", new LosungForm());
        losungFormList.add(losungForm);
        model.addAttribute("losungFormList", losungFormList);
        verschlimmerungFormList.get(losungForm.getIndexOfVerschlimmerung()).getLosungen().add(losungForm);

        return "ansicht";
    }


}
