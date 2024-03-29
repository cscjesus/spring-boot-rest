package edu.jhl.controllers;

import edu.jhl.models.Owner;
import edu.jhl.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@CrossOrigin("*")
@RestController
@RequestMapping("api/owners")
public class OwnerController {
    @Autowired
    private OwnerService ownerService;
    @GetMapping
    public ResponseEntity<List<Owner>> listar(){
        return ResponseEntity.ok(ownerService.getAllOwners());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Owner> listarById(@PathVariable long id){
        return ResponseEntity.ok(ownerService.findOwnerById(id));
    }
    @PostMapping
    public ResponseEntity<Owner> crear(@RequestBody Owner  owner){
        return new ResponseEntity<>( ownerService.createOwner(owner),HttpStatus.CREATED);
    }
    @PutMapping("edit/{id}")
    public ResponseEntity<Owner> actualizar(@RequestBody Owner owner,@PathVariable long id){
        owner.setOwnerid(id);
        return ResponseEntity.ok(ownerService.updateOwner(owner));
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> eliminar(@PathVariable long id){
        ownerService.deleteOwner(id);
        return ResponseEntity.ok("Owner deleted successfully");
    }
}