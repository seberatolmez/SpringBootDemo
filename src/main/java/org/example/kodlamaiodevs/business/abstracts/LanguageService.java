package org.example.kodlamaiodevs.business.abstracts;

import org.example.kodlamaiodevs.entities.concrets.ProgrammingLanguage;

import java.util.List;

public interface LanguageService {
    List<ProgrammingLanguage> getAll();
    public void addLanguage(ProgrammingLanguage programmingLanguage);
    public void deleteLanguage(ProgrammingLanguage programmingLanguage);
    public void updateLanguage(ProgrammingLanguage programmingLanguage);
}
