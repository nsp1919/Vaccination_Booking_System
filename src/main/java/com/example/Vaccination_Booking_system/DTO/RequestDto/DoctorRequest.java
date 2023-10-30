package com.example.Vaccination_Booking_system.DTO.RequestDto;

import com.example.Vaccination_Booking_system.Enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DoctorRequest {
    int age;

    Gender gender;

    String doctorName;
}
