package com.example.Vaccination_Booking_system.Repository;

import com.example.Vaccination_Booking_system.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
