package pet.linkedlist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pet.Settings;
import pet.arrays.MyArray;

@Controller
@RequestMapping("/linklists")
public class LListsController {

    @GetMapping()
    public String showArraysPage(Model model){

        LinkList list= new LinkList();
        list.fillRandom();
        model.addAttribute("list", list);
        return "lists";
    }
}
