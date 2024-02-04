package pet.arrays;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pet.Settings;

@Controller
@Slf4j
@RequestMapping("/arrays")
public class ArraysController {

    MyArray array;

    @GetMapping()
    public String showArraysPage(Model model){

        array = new MyArray(Settings.ARRAY.size());
        array.fillRandom();
        model.addAttribute("array", array);
        return "Arrays/arrays";
    }

    @RequestMapping(value="/ReloadArrayTable", method= RequestMethod.POST)
    public String UpdateArray(Model model) {
        array = new MyArray(Settings.ARRAY.size());
        array.fillRandom();
        model.addAttribute("array", array);
        return "Arrays/ArraysFragments :: New_Array";
    }

}
