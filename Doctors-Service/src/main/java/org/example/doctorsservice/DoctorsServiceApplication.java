package org.example.doctorsservice;

import org.example.doctorsservice.dao.DoctorRepo;
import org.example.doctorsservice.entities.Doctor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DoctorsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoctorsServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(DoctorRepo repo) {
        return args -> {

            Doctor doctor1 = Doctor.builder()
                    .name("Dctr Ahmed Amine Anoubl")
                    .university("faculté Md5")
                    .build();
            Doctor doctor2 = Doctor.builder()
                    .name("Dctr Rayan Anoubl")
                    .university("faculté Md5")
                    .build();
            List<Doctor> doctors = List.of(doctor1, doctor2);
            repo.saveAll(doctors);
        };
    }
}
