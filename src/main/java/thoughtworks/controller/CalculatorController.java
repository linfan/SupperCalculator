/*
 * Copyright 2008 Inc.
 *
 * (details of open-source license...)
 */

package thoughtworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import thoughtworks.model.Calculator;

@Controller
@RequestMapping(value = "/")
public class CalculatorController {

    private double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
    public String calculate(@ModelAttribute("SpringWeb") Calculator calculator, ModelMap model) {
        model.addAttribute("firstNumber", calculator.getFirstNumber());
        model.addAttribute("operation", calculator.getOperation());
        model.addAttribute("secondNumber", calculator.getSecondNumber());
        model.addAttribute("result", round(calculator.calculate(), 10));
        model.addAttribute("calculator", calculator);
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init(Model model) {

        model.addAttribute("calculator", new Calculator());
        return "index";
    }

}
