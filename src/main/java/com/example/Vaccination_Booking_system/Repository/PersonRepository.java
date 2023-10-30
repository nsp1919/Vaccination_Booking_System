package com.example.Vaccination_Booking_system.Repository;

import com.example.Vaccination_Booking_system.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {


}
