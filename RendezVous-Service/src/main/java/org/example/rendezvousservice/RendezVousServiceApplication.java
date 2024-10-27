package org.example.rendezvousservice;

import org.example.rendezvousservice.dao.AppointmentRepo;
import org.example.rendezvousservice.entities.Appointment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class RendezVousServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RendezVousServiceApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(AppointmentRepo appointmentRepo) {
        return args -> {

            List<Appointment> appointments = List.of(
                    Appointment.builder()
                            .date(LocalDate.now())
                            .DoctorId(1L)
                            .title("Appointment 1")
                            .build(),
                    Appointment.builder()
                            .date(LocalDate.now())
                            .title("Appointment 2")
                            .DoctorId(2L)
                            .build()
            );
            appointmentRepo.saveAll(appointments);
        };
    }
}
