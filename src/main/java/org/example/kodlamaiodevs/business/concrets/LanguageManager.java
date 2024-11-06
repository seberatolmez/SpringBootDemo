package org.example.kodlamaiodevs.business.concrets;

import org.example.kodlamaiodevs.business.abstracts.LanguageService;
import org.example.kodlamaiodevs.dataaccess.concrets.InMemoryLanguagesRepository;
import org.example.kodlamaiodevs.entities.concrets.ProgrammingLanguage;

import java.util.List;

public class LanguageManager implements LanguageService {
    @Override
    public void addLanguage(ProgrammingLanguage programmingLanguage) {
        if(programmingLanguage == null || programmingLanguage.getName().isEmpty()){
           throw new IllegalArgumentException("Programming Language is null or empty");
        }
        for (ProgrammingLanguage language: languagesRepository.getAll() ){
            if(language.getName().equals(programmingLanguage.getName())){
                throw new IllegalArgumentException("Programming Language already exists");

            }
        }
    languagesRepository.addLanguage(programmingLanguage);
        System.out.println("Language added successfully");
    }

    @Override
    public void deleteLanguage(ProgrammingLanguage programmingLanguage) {

    }

    @Override
    public void updateLanguage(ProgrammingLanguage programmingLanguage) {

    }

    private InMemoryLanguagesRepository languagesRepository;

    public LanguageManager(InMemoryLanguagesRepository languagesRepository) {
        this.languagesRepository = languagesRepository;

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languagesRepository.getAll();
    }
}
