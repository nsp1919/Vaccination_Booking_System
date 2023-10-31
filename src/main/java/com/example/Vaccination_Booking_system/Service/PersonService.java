package com.example.Vaccination_Booking_system.Service;

import com.example.Vaccination_Booking_system.DTO.RequestDto.PersonRequest;
import com.example.Vaccination_Booking_system.DTO.ResponseDto.PersonResponse;
import com.example.Vaccination_Booking_system.Exceptions.IdNotFoundException;
import com.example.Vaccination_Booking_system.Model.Doctor;
import com.example.Vaccination_Booking_system.Model.Person;
import com.example.Vaccination_Booking_system.Repository.DoctorRepository;
import com.example.Vaccination_Booking_system.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    PersonRepository personRepository;
     public PersonResponse addPerson(PersonRequest personRequest) {
         
         Person person=new Person();
         person.setName(personRequest.getName());
         person.setPersonId(personRequest.getPersonId());
         person.setAge(personRequest.getAge());
         person.setGender(personRequest.getGender());
         personRepository.save(person);
         PersonResponse personResponse=new PersonResponse();
         personResponse.setPersonId(person.getPersonId());
         personResponse.setMessage("Person added");
         return personResponse;
    }


//    public String assignDoctor(int personId,int doctorId) {
//        Optional<Person> personOptional=personRepository.findById(personId);
//        if (!personOptional.isPresent()){
//            throw new IdNotFoundException("Id not found");
//        }
//        Person person=personOptional.get();
//        Optional<Doctor> optionalDoctor=doctorRepository.findById(doctorId);
//        if (!optionalDoctor.isPresent()) throw new IdNotFoundException("Doctor Id not found");
//        Doctor doctor=optionalDoctor.get();
//        person.setDose1Taken(true);
//        person.setDose2taken(false);
//        person.setDoctor(doctor);
//        doctor.getPersonList().add(person);
//        doctorRepository.save(doctor);
//        return "doctorPersonList";
//    }
}
