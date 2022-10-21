package mvc.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class HelloController {
    @RequestMapping("/showForm")
    public String showForm() {
        return "hello-form";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String greeting = "Yo! " + name.toUpperCase(Locale.ROOT);
        model.addAttribute("greeting", greeting);
        return "hello";
    }
}
