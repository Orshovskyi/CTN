package com.example.CTN.controller;

import com.example.CTN.model.User;
import com.example.CTN.repo.CTNRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class MainController {

    private final CTNRepo ctnRepo;

    @Value("${spring.profiles.active}")
    private String profile;

    @Autowired
    public MainController(CTNRepo ctnRepo) {
        this.ctnRepo = ctnRepo;
    }


    @GetMapping
    public String main(Model model, @AuthenticationPrincipal User user){
        HashMap<Object, Object> data = new HashMap<>();
        if(user != null) {
            data.put("profile", user);
            data.put("ctns", ctnRepo.findAll());
        }
        model.addAttribute("frontendData", data);
        model.addAttribute("isDevMode", "dev".equals(profile));

        return "cityTelephoneNetwork";
    }
}
