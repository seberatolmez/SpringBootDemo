package org.example.kodlamaiodevs.dataaccess.abstracts;

import org.example.kodlamaiodevs.entities.concrets.ProgrammingLanguage;

import java.util.List;

public interface ILanguagesRepository {
    List<ProgrammingLanguage> getAll();
    public void addLanguage(ProgrammingLanguage programmingLanguage);
    public void deleteLanguage(ProgrammingLanguage programmingLanguage);
    public void updateLanguage(ProgrammingLanguage programmingLanguage);
}
