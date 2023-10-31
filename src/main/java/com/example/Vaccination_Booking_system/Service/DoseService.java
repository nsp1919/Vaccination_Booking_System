package com.example.Vaccination_Booking_system.Service;

import com.example.Vaccination_Booking_system.DTO.ResponseDto.DoseResponse;
import com.example.Vaccination_Booking_system.Enums.DoseType;
import com.example.Vaccination_Booking_system.Exceptions.DoseAlreadyTakenException;
import com.example.Vaccination_Booking_system.Exceptions.IdNotFoundException;
import com.example.Vaccination_Booking_system.Model.Certificate;
import com.example.Vaccination_Booking_system.Model.Dose;
import com.example.Vaccination_Booking_system.Model.Person;
import com.example.Vaccination_Booking_system.Repository.DoseRepository;
import com.example.Vaccination_Booking_system.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoseService {

    @Autowired
    PersonRepository personRepository;



    public DoseResponse getDose1(Integer personId, DoseType doseType) {
        Optional<Person> optionalPerson=personRepository.findById(personId);
        if (!optionalPerson.isPresent()){
            throw new IdNotFoundException("person Id not found");
        }
        Person person=optionalPerson.get();
        if (person.isDose1Taken()){
            throw new DoseAlreadyTakenException("Dose 1 already taken");
        }

        Dose dose=new Dose();
        dose.setDoseType(doseType);
        dose.setPerson(person);
        person.setDose1Taken(true);
        person.getDoseList().add(dose);
        personRepository.save(person);
        Dose newDose=person.getDoseList().get(0);
        DoseResponse doseResponse=new DoseResponse();
        doseResponse.setDoseId(newDose.getDoseId());
        doseResponse.setDoseType(doseType);
        doseResponse.setDate(newDose.getVaccinationDate());
        doseResponse.setPersonName(person.getName());
        return doseResponse;

    }

    public DoseResponse getDose2(Integer personId, DoseType doseType) {
        Optional<Person> optionalPerson=personRepository.findById(personId);
        if (!optionalPerson.isPresent()) throw new IdNotFoundException("person Id not found");
        Person person=optionalPerson.get();
        if (!person.isDose1Taken()) throw new DoseAlreadyTakenException("Dose 1 not taken");
        if (person.isDose2taken()) throw  new DoseAlreadyTakenException("dose 2 already taken");
        Dose dose=new Dose();
        dose.setDoseType(doseType);
        dose.setPerson(person);
        person.setDose2taken(true);
        person.getDoseList().add(dose);
        personRepository.save(person);
        Dose updatedDose=person.getDoseList().get(1);
        DoseResponse doseResponse=new DoseResponse();
        doseResponse.setDoseId(updatedDose.getDoseId());
        doseResponse.setDate(updatedDose.getVaccinationDate());
        doseResponse.setDoseType(doseType);
        doseResponse.setPersonName(person.getName());
        return doseResponse;
    }
}
