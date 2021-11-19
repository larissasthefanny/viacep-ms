package com.example.viacepms.interfaces;

import com.example.viacepms.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ZipService {

    @GetMapping("{cep}/json")
    Address searchAddressByZipCode(@PathVariable ("cep") String cep);
}
