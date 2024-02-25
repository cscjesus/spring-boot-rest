package edu.jhl.controllers;

import edu.jhl.models.Owner;
import edu.jhl.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/owners")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;
    @GetMapping
    public List<Owner> listar(){
        return ownerService.getAllOwners();
    }
    @PostMapping
    public Owner crear(@RequestBody Owner  owner){
        return ownerService.createOwner(owner);
    }
    @PutMapping("edit/{id}")
    public Owner actualizar(@RequestBody Owner owner,@PathVariable long id){
        owner.setOwnerid(id);
        return ownerService.updateOwner(owner);
    }
    @DeleteMapping("delete/{id}")
    public void eliminar(@PathVariable long id){
        ownerService.deleteOwner(id);
    }
}