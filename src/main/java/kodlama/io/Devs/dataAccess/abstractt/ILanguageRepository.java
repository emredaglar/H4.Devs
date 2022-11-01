package kodlama.io.Devs.dataAccess.abstractt;

import kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface ILanguageRepository {
    List<Language> getAll();
    Language getId(int id);
    void add(Language language);
    void uptade(Language language);
    void delete(int id);
}
