package com.brandon_stokes.service;

import com.brandon_stokes.persist.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> findAll();

    Person findOne(Long id);

    void save(Person person);

    void delete(Long id);

}
