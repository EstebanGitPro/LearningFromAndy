package com.uco.stloan.Services.Persona;

import com.uco.stloan.dto.PersonDTO;
import com.uco.stloan.exception.NotFoundEx;
import com.uco.stloan.model.Person;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.List;

public interface PersonService {

    public List<Person> findAll();
    public Person findById(Long id);
    public Person save( Person person);
    public void deleteById(Long id);
    public boolean partialUpdate(Long id, String key, String value) throws NotFoundEx;

}
