package pet.linkedlist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/linklists")
public class LListsController {
    LinkList list;

    @GetMapping()
    public String showArraysPage(Model model){

        list= new LinkList();
        list.fillRandom();
        model.addAttribute("list", list);
        return "Lists/lists";
    }

    @RequestMapping(value = "/ReloadListTable", method = RequestMethod.POST)
    public String UpdateList(Model model){
        list= new LinkList();
        list.fillRandom();
        model.addAttribute("list", list);
        return "Lists/ListsFragments :: New_List";
    }
}
