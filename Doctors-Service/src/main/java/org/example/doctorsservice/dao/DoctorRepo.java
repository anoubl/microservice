package org.example.doctorsservice.dao;

import org.example.doctorsservice.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor, Long> {

}
