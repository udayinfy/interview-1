package com.brandon_stokes.service;

import com.brandon_stokes.persist.dao.PersonDao;
import com.brandon_stokes.persist.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    public List<Person> findAll() {
        List<Person> persons = null;
        try {
            persons = personDao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return persons;
    }

    public Person findOne(Long id) {
        Person person = null;
        try {
            person = personDao.queryForId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return person;
    }

    public void save(Person person) {
        try {
            personDao.createOrUpdate(person);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(Long id) {
        try {
            personDao.deleteById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
