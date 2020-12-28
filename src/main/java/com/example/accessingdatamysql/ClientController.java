package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@CrossOrigin("*")
@RequestMapping(path = "/BOUTIQUE")
public class ClientController {

    @Autowired
    private ClientRepository repository;

    @GetMapping(path = "/clients")
    public List<Client> getClients()
    {
        return repository.findAll();
    }

    @PostMapping(path = "/add1")
    public @ResponseBody Client saveClient(@RequestBody Client c)
    {
      return repository.save(c);
    }
}
