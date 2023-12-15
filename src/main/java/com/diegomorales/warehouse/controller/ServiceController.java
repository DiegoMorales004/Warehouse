package com.diegomorales.warehouse.controller;

import com.diegomorales.warehouse.dto.ServiceDTO;
import com.diegomorales.warehouse.exception.BadRequestException;
import com.diegomorales.warehouse.exception.GenericException;
import com.diegomorales.warehouse.service.ServiceDomainService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/api/service")
@AllArgsConstructor
@PreAuthorize("hasRole('ADMIN')")
public class ServiceController {

    private ServiceDomainService service;

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody ServiceDTO dto) throws GenericException, BadRequestException{
        var response = this.service.save(dto);
        return ResponseEntity.ok(response);
    }

}