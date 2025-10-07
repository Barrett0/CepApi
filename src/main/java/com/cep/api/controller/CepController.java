package com.cep.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cep.api.dto.ViaCepResponse;
import com.cep.api.service.CepService;

@RestController
@RequestMapping("/api/cep")
public class CepController {
	
             
	    private final CepService cepService;
             
        public CepController (CepService cepService) {
        	this.cepService = cepService;
        	
        }
               @GetMapping ("/{cep}")
              public ViaCepResponse getCep(@PathVariable String cep) {
            	   return cepService.buscarPorCep(cep);
               }


}
