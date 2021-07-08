package pl.wsiz.iid6.gr2.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wsiz.iid6.gr2.patientservice.entity.Lek;
import pl.wsiz.iid6.gr2.patientservice.service.LekService;

import java.util.List;

@Controller
@RequestMapping(value = "/leki")
public class LekController {
    @Autowired
    private LekService lekService;

    @RequestMapping(path ="/all")
    public String getAll(final ModelMap model)throws Exception{
        List<Lek> allL = lekService.findAll();
        model.addAttribute("leki", allL);
        return "lekiAll.html";
    }
}
