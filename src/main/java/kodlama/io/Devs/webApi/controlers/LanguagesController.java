package kodlama.io.Devs.webApi.controlers;

import kodlama.io.Devs.bussines.abstractt.ILanguageService;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private ILanguageService iLanguageService;

    @Autowired
    public LanguagesController(ILanguageService iLanguageService) {
        this.iLanguageService = iLanguageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll(){
        return iLanguageService.getAll();
    }

    @GetMapping("/getId/{id}")
    public Language getId(@PathVariable int id){
        return iLanguageService.getId(id);
    }

    @PostMapping("/add-language")
    public void add(@RequestBody Language language){
        iLanguageService.add(language);
    }
    @PutMapping("/update-language")
    public void uptade(@RequestBody Language language){
        iLanguageService.uptade(language);
    }
    @DeleteMapping("/delete-language")
    public void delete(@RequestParam int id){
        iLanguageService.delete(id);
    }
}
