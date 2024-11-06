package org.example.kodlamaiodevs.dataaccess.concrets;

import org.example.kodlamaiodevs.dataaccess.abstracts.ILanguagesRepository;
import org.example.kodlamaiodevs.entities.concrets.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguagesRepository implements ILanguagesRepository {
    List<ProgrammingLanguage> languages;

    public InMemoryLanguagesRepository() {
        languages = new ArrayList<ProgrammingLanguage>();
        languages.add(new ProgrammingLanguage(1,"C#"));
        languages.add(new ProgrammingLanguage(2,"Java"));
        languages.add(new ProgrammingLanguage(3,"Python"));

    }
    @Override
    public List<ProgrammingLanguage> getAll() {
        return languages;

    }

    @Override
    public void addLanguage(ProgrammingLanguage programmingLanguage) {
        languages.add(programmingLanguage);
    }

    @Override
    public void deleteLanguage(ProgrammingLanguage programmingLanguage) {
        for (int i = 0; i < languages.size(); i++) {
            if (languages.get(i).getId() == programmingLanguage.getId()) {
                languages.remove(i);
                return;
            }

        }
        throw new RuntimeException("Programming language not found to delete");
    }

    @Override
    public void updateLanguage(ProgrammingLanguage programmingLanguage) {
        for(int i = 0;i <languages.size();i++ ){
            if (languages.get(i).getId() == programmingLanguage.getId()) {
                languages.get(i).setName(programmingLanguage.getName());
            }
        }
        throw new RuntimeException("Programming language not found to update");
    }


}
