/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceFootwear;
import Reto2_Web.modelo.Footwear;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class FootwearRepositorio {
    @Autowired
    private InterfaceFootwear repository;

    public List<Footwear> getAll() {
        return repository.findAll();
    }

    public Optional<Footwear> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Footwear create(Footwear clothe) {
        return repository.save(clothe);
    }

    public void update(Footwear clothe) {
        repository.save(clothe);
    }
    
    public void delete(Footwear clothe) {
        repository.delete(clothe);
    }
}
