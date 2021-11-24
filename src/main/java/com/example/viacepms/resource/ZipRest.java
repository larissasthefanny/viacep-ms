package com.example.viacepms.resource;

import com.example.viacepms.service.ZipService;
import com.example.viacepms.model.Address;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/viacep")
public class ZipRest {

    ZipService zipService;

    @GetMapping("/{cep}")
    public ResponseEntity<Address> getCep(@PathVariable String cep){
        Address address = zipService.searchAddressByZipCode(cep);

        return address != null ? ResponseEntity.ok().body(address) : ResponseEntity.notFound().build();
    }
}
