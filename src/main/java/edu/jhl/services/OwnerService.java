package edu.jhl.services;

import edu.jhl.models.Owner;
import edu.jhl.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {
    @Autowired
    private OwnerRepository ownerRepository;

    //mostrar todos los Owners
    public List<Owner> getAllOwners() {
        return (List<Owner>) ownerRepository.findAll();
    }

    //Crear Owner
    public Owner createOwner(Owner Owner) {
        return ownerRepository.save(Owner);
    }

    //editar Owner
    public Owner updateOwner(Owner Owner) {
        return ownerRepository.save(Owner);
    }

    //eliminar Owner
    public void deleteOwner(long id) {
        ownerRepository.deleteById(id);
    }

    //buscar Owner por id
    public Owner findOwnerById(long id) {
        return ownerRepository.findById(id).orElseGet(null);
    }
}
