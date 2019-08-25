package com.SelectionProject.SelectionProject.controller;

        import com.SelectionProject.SelectionProject.model.Age;
        import com.SelectionProject.SelectionProject.model.AgeRepository;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.Optional;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping(value = "/form")
public class AgeController {

    @Autowired
    AgeRepository ageRepository;

    @GetMapping("/age/{id}")
    public Age getAge(@PathVariable(value = "id") long id){
        return ageRepository.findById(id);
    }


}
