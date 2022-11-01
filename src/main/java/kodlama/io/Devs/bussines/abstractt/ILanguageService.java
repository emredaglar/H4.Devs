package kodlama.io.Devs.bussines.abstractt;

import kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface ILanguageService {
    List<Language> getAll();

    Language getId(int id);
    void delete(int id);
    void add(Language language);
    void uptade(Language language);

}
