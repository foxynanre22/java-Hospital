package pl.wsiz.iid6.gr2.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.gr2.patientservice.service.PatientService;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping(path = "/wiek")
    @ResponseBody
    public String zycie(@RequestParam int datayrodz ,@RequestParam int ostatniaData,@RequestParam boolean zyjeOrnie) {
        if (zyjeOrnie) {
            return "jescie zyje";
        }
        else{
            int zycie = ostatniaData- datayrodz; return Integer.toString(zycie);
        }
    }

    @GetMapping(path = "/findById")
    @ResponseBody
    public String patientById(@RequestParam Long Id){
        return (patientService.findById(Id)).toString();
    }

    @GetMapping(path = "/findByLN")
    @ResponseBody
    public String patientByLastName(@RequestParam String lastName){
        return patientService.findByLastName(lastName);
    }
}
