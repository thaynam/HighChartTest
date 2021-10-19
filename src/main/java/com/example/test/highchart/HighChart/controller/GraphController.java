package com.example.test.highchart.HighChart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class GraphController {

    @GetMapping("/barChart")
    public String barChart(Model model){

        Map<String, Integer> data = new LinkedHashMap<String, Integer>();
        data.put("Thaynam", 11);
        data.put("Joana", 21);
        data.put("Carlos", 31);
        data.put("Cadu", 41);
        model.addAttribute("keySet", data.keySet());
        model.addAttribute("values",data.values());
        return "barChart";
    }

    @GetMapping("/pieChart")
    public String piChart(Model model){
        model.addAttribute("pass",90);
        model.addAttribute("fail",10);
        return "pieChart";
    }
}
