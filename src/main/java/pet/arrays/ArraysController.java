package pet.arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet.Settings;

@Controller
@RequestMapping("/arrays")
public class ArraysController {

    MyArray array;

    @GetMapping()
    public String showArraysPage(Model model){

        array = new MyArray(Settings.ARRAY.size());
        array.fillRandom();
        model.addAttribute("array", array);
        return "arrays";
    }
}
