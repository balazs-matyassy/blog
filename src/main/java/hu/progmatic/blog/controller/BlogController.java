package hu.progmatic.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BlogController {

    @GetMapping("/")
    public String listAllEntries(Model model) {
        return "index.html";
    }

    @GetMapping("/uj")
    public String createEntry(Model model) {
        return "new.html";
    }

    @GetMapping("/bejegyzesek/{id}")
    public String viewEntry(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);

        return "entry.html";
    }
}
