package com.pa.spring.prueba1.pa_prueba1.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {

    @GetMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        Object ex = request.getAttribute("jakarta.servlet.error.exception");
        if (ex == null) {
            ex = request.getAttribute("javax.servlet.error.exception");
        }
        String message = "Se produjo un error inesperado.";
        if (ex instanceof Exception) {
            message = ((Exception) ex).getMessage();
        } else if (ex != null) {
            message = ex.toString();
        }
        model.addAttribute("errorMessage", message);
        return "error";
    }
}
