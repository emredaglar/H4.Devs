package kodlama.io.Devs.bussines.concretes;

import kodlama.io.Devs.bussines.abstractt.ILanguageService;
import kodlama.io.Devs.dataAccess.abstractt.ILanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements ILanguageService {
    private ILanguageRepository iLanguageRepository;

    public LanguageManager(ILanguageRepository iLanguageRepository) {
        this.iLanguageRepository = iLanguageRepository;
    }

    @Override
    public List<Language> getAll() {
        return iLanguageRepository.getAll();
    }

    @Override
    public Language getId(int id) {
        return iLanguageRepository.getId(id);
    }






    @Override
    public void add(Language language) {
        if (!language.getName().isEmpty()) {
            for (Language language1 : iLanguageRepository.getAll()) {
                if (language1.getName().equalsIgnoreCase(language.getName())) {
                    System.out.printf("Programa dili isimleri aynı olamaz");
                }
            }
            iLanguageRepository.add(language);
        } else {
            System.out.println("Dil alanı boş olamaz");
        }
    }

    @Override
    public void delete(int id) {
        iLanguageRepository.delete(id);

    }

    @Override
    public void uptade(Language language) {
        if (!language.getName().equals("")) {
            iLanguageRepository.uptade(language);
        } else {
            throw new RuntimeException("Dil alanı boş olamaz");
        }
    }
    public boolean isExist(Language language) {
        boolean control = false;
        for (Language lng : iLanguageRepository.getAll()) {
            if (lng.getName().equals(language.getName()) || lng.getId() == language.getId()) {
                control = true;
            }
        }
        return control;
    }
}
