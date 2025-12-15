package edu.teis.appmonedas.controller;

import edu.teis.appmonedas.dto.IndexFormDto;
import edu.teis.appmonedas.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExchangeController {

    private final ExchangeService exchangeService;

    @Autowired
    public ExchangeController(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("formDto", new IndexFormDto());
        return "index";
    }

    @PostMapping("/exchange")
    public String exchange(IndexFormDto formDto, Model model){

        Double result = exchangeService.exchangeRate(
                formDto.getImporte(),
                formDto.getDivisaOrigen(),
                formDto.getDivisaDestino()
        );

        model.addAttribute("formDto",formDto);
        model.addAttribute("result",result);
        return "index";
    }
}
