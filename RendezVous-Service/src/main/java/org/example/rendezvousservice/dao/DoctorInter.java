package org.example.rendezvousservice.dao;

import org.example.rendezvousservice.models.Doctor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "DOCTORS-SERVICE")
public interface DoctorInter {
    @GetMapping("/api/doctor/byId/{id}")
    Doctor getDoctorById(@PathVariable  Long id);
}
