package edu.teis.appmonedas.controller;

import edu.teis.appmonedas.dto.IndexFormDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExchangeController {

    @PostMapping("/exchange")
    public String exchange(IndexFormDto formDto, Model model){
        model.addAttribute("formDto",formDto);
        return "exchange";
    }
}
