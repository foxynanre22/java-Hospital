package pl.wsiz.iid6.gr2.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiz.iid6.gr2.patientservice.dto.Pacjent;
import pl.wsiz.iid6.gr2.patientservice.entity.PatientEntity;
import pl.wsiz.iid6.gr2.patientservice.service.PatientService;

import java.util.List;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;


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

    @GetMapping(path="/all")
    @ResponseBody
    public String patientAll(){
        String s="";
        for (PatientEntity x : patientService.findAll()) {
            s=s+"<p>"+x.toString()+"</p>";
        } return s;
    }

    @GetMapping(path="/names")
    @ResponseBody
    public String patientName(@RequestParam String name){
        return (patientService.findByLastName(name)).toString();
    }

    @GetMapping(path="/id")
    @ResponseBody
    public String patientId(@RequestParam Long idP){
        return (patientService.findById(idP)).toString();
    }

    @RequestMapping (path = "/pacjent")
    public String pacjent(final ModelMap model, @RequestParam Long idP) {
        model.addAttribute("nr", idP);
        Pacjent patient = patientService.findById(idP);
        model.addAttribute("imie", patient.getImie());
        model.addAttribute("nazwisko", (patient.getNazwisko()));
        model.addAttribute("pesel", (patient.getPesel()));
        return "pacjent.html";
    }
    @RequestMapping (path = "/patientsall")
    public String listPatients(final ModelMap model) throws Exception {
        List<PatientEntity> allPatient = patientService.findAll();
        model.addAttribute("patients", allPatient);
        return "pacjentAll.html";
    }
}
