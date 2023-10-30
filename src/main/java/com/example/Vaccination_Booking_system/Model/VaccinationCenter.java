package com.example.Vaccination_Booking_system.Model;


import com.example.Vaccination_Booking_system.Enums.CenterType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccinationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String centerId;

    String centerName;

    @Enumerated(value = EnumType.STRING)
    CenterType centerType;

    String address;

    @OneToMany(mappedBy = "vaccinationCenter",cascade = CascadeType.ALL)
    List<Doctor> doctorList=new ArrayList<>();

}
