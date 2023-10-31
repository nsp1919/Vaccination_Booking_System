package com.example.Vaccination_Booking_system.Repository;

import com.example.Vaccination_Booking_system.Model.Dose;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoseRepository extends JpaRepository<Dose, CriteriaBuilder.In> {
}
