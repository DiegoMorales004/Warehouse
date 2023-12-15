package com.diegomorales.warehouse.repository;

import com.diegomorales.warehouse.domain.ServiceDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServiceRepository extends JpaRepository<ServiceDomain, Integer> {
    Optional<ServiceDomain> findFirstByNameContainsIgnoreCase(String name);
}