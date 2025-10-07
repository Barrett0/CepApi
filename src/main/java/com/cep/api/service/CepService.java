package com.cep.api.service;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.cep.api.dto.ViaCepResponse;
import com.cep.api.exception.CepNotFoundException;
import com.cep.api.exception.InvalidCepException;

@Service
public class CepService {
	
	
	private final RestTemplate  restTemplate;
	
	private static final String VIACEP_URL = "https://viacep.com.br/ws/{cep}/json";
	
	public CepService (RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}
	public ViaCepResponse buscarPorCep (String cep) {
		String sanitized =  cep.replaceAll("[^0-9]",""); //remove  traço /ponto /espaço
	
	if(!sanitized.matches("\\d{8}")) {
			
	throw new InvalidCepException("Cep invalido. Deve conter 8 digito.");
		}
	try {
	ResponseEntity<ViaCepResponse> resp = restTemplate.getForEntity(VIACEP_URL,ViaCepResponse.class,sanitized);
	  ViaCepResponse body = resp.getBody();
	  if (body == null || (body.getErro() != null && body.getErro())){
		  throw new 
		  CepNotFoundException("CEP nao encontrado");
	  }
					  
	             return body;
	         } catch
	     (HttpClientErrorException e) {
	        	 throw new 
	        	 CepNotFoundException("Erro ao consultar serviço externo.");
	         }
	
	}

}
