package hu.progmatic.blog.controller;

import hu.progmatic.blog.model.Entry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;

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
        Entry entry = new Entry();
        entry.setId(id);
        entry.setTitle("Test Title");
        entry.setContent("Test Content");
        entry.setCreated(LocalDateTime.now());
        model.addAttribute("entry", entry);

        return "entry.html";
    }
}
