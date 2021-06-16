package pl.wsiz.iid6.gr2.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.gr2.patientservice.dto.Lek;
import pl.wsiz.iid6.gr2.patientservice.dto.Pacjent;
import pl.wsiz.iid6.gr2.patientservice.entity.LekEntity;
import pl.wsiz.iid6.gr2.patientservice.service.LekService;

import java.util.List;

@Controller
@RequestMapping(path = "/medicine")
public class MedicineController {
    @Autowired
    private LekService lekService;

    @GetMapping(path = "/findById")
    @ResponseBody
    public String patientById(@RequestParam Long Id){
        return (lekService.findById(Id)).toString();
    }

    @GetMapping(path = "/findByLN")
    @ResponseBody
    public String patientByLastName(@RequestParam String name){
        return lekService.findByName(name);
    }

    @GetMapping(path="/all")
    @ResponseBody
    public String patientAll(){
        String s="";
        for (LekEntity x : lekService.findAll()) {
            s=s+"<p>"+x.toString()+"</p>";
        } return s;
    }

    @GetMapping(path="/nazwa")
    @ResponseBody
    public String patientName(@RequestParam String name){
        return (lekService.findByName(name)).toString();
    }

    @GetMapping(path="/id")
    @ResponseBody
    public String patientId(@RequestParam Long idP){
        return (lekService.findById(idP)).toString();
    }

    @RequestMapping (path = "/lek")
    public String pacjent(final ModelMap model, @RequestParam Long idP) {
        Lek lek = lekService.findById(idP);
        model.addAttribute("name", lek.getNazwa());
        model.addAttribute("producent", (lek.getProducent()));
        model.addAttribute("ilosc", (lek.getIlosc()));
        return "lek.html";
    }
    @RequestMapping (path = "/lekiall")
    public String listPatients(final ModelMap model) throws Exception {
        List<LekEntity> allPatient = lekService.findAll();
        model.addAttribute("leki", allPatient);
        return "lekiAll.html";
    }
}
