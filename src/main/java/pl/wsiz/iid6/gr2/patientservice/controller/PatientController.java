package pl.wsiz.iid6.gr2.patientservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {
    @GetMapping(path = "/hej")
    @ResponseBody
    public String witaj(){
        return "Hello world !";
    }

    @GetMapping(path = "/start")
    @ResponseBody
    public String start(){
        return "We are starting here";
    }

    @GetMapping(path = "/wiek")
    @ResponseBody public String wiek(@RequestParam int wiek) {
        return "wiek:" + wiek;
    }
    public String zycie(@RequestParam int datayrodz ,@RequestParam int ostatniaData,@RequestParam boolean zyjeOrnie) {
        if (zyjeOrnie) {
            return "jescie zyje";
        }
        else{
            int zycie = ostatniaData- datayrodz; return Integer.toString(zycie);
        }
    }

}
