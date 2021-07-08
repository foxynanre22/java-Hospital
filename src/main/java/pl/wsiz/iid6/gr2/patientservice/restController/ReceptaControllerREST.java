package pl.wsiz.iid6.gr2.patientservice.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wsiz.iid6.gr2.patientservice.entity.Recepta;
import pl.wsiz.iid6.gr2.patientservice.service.ReceptaService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/")
public class ReceptaControllerREST {
    @Autowired
    private ReceptaService receptaService;

    @GetMapping(value = "pesel", produces = "application/json")
    public List<Recepta> indexId(@RequestParam String pesel) {
        List<Recepta> recepta = receptaService.findAllByPesel(pesel);
        return recepta;
    }
    @GetMapping(value = "all", produces = "application/json")
    public List<Recepta> index() {
        List<Recepta> receptaList = receptaService.findAll();
        return receptaList;
    }
}
