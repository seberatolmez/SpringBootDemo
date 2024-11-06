package org.example.kodlamaiodevs.webapi.controllers;

import org.example.kodlamaiodevs.business.abstracts.LanguageService;
import org.example.kodlamaiodevs.entities.concrets.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@Controller
public class LanguagesController {
    private LanguageService languageService;


    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;

    }

    @PostMapping("/add")
    public void addLanguage(ProgrammingLanguage programmingLanguage) {
        this.languageService.addLanguage(programmingLanguage);

    }

    @DeleteMapping("/delete")
    public void deleteLanguage(ProgrammingLanguage programmingLanguage) {
        this.languageService.deleteLanguage(programmingLanguage);

    }

    @PutMapping("/update")
    public void updateLanguage(ProgrammingLanguage programmingLanguage) {
        this.languageService.updateLanguage(programmingLanguage);

    }
    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll() {
        return this.languageService.getAll();
    }
}
