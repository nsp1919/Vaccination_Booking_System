package com.example.Vaccination_Booking_system.Model;


import com.example.Vaccination_Booking_system.Enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {
    @Id
    @Column(unique = true,nullable = false)
    Integer personId;

    String name;

    int age;

    @Enumerated(value = EnumType.STRING)
    Gender gender;

    boolean dose1Taken;

    boolean dose2taken;

   @OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
   Certificate certificate;


    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    List<Dose> doseList=new ArrayList<>();

    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    List<Appointment> appointmentList=new ArrayList<>();
}

