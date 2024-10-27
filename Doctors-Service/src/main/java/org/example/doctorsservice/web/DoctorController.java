package org.example.doctorsservice.web;

import org.example.doctorsservice.dao.DoctorRepo;
import org.example.doctorsservice.entities.Doctor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    private DoctorRepo doctorRepo;

    public DoctorController(DoctorRepo doctorRepo) {
        this.doctorRepo = doctorRepo;
    }
    @GetMapping()
    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }
    @GetMapping("/byId/{id}")
    public  Doctor getDoctorById(@PathVariable Long id) {
        return doctorRepo.findById(id).get();
    }
}
