package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstractt.ILanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements ILanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages =new ArrayList<Language>();
        languages.add(new Language(1,"Python"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"Java"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getId(int id) {
        for (Language language:languages){
            if (language.getId()==id){
                return language;
            }
        }
        return null;
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(int id) {
        for (Language lng:languages){
            if (lng.getId()==id){
                languages.remove(id);
            }
        }
    }

    @Override
    public void uptade(Language language) {
        for (Language lng:languages){
            if (language.getId()== lng.getId()){
                lng.setId(language.getId());
                lng.setName(language.getName());
            }
        }
    }
}
