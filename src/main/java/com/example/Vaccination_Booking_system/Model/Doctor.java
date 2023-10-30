package com.example.Vaccination_Booking_system.Model;

import com.example.Vaccination_Booking_system.Enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Doctor {
    @Id
    @Column(unique = true,nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer doctorId;

    int age;

    @Enumerated(value = EnumType.STRING)
    Gender gender;

    String doctorName;

    @ManyToOne
    @JoinColumn
    VaccinationCenter vaccinationCenter;

    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    List<Appointment> appointmentList=new ArrayList<>();

}
