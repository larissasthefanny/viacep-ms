package com.example.viacepms.rest;

import com.example.viacepms.interfaces.ZipService;
import com.example.viacepms.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipRest {
    @Autowired
    ZipService zipService;

    @GetMapping("/{cep}")
    public ResponseEntity<Address> getCep(@PathVariable String cep){
        Address address = zipService.searchAddressByZipCode(cep);

        return address != null ? ResponseEntity.ok().body(address) : ResponseEntity.notFound().build();
    }
}
