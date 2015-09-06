package com.brandon_stokes.persist.dao;

import com.brandon_stokes.persist.entity.Person;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component
public class PersonDaoImpl extends BaseDaoImpl<Person, Long> implements PersonDao {

    @Autowired
    public PersonDaoImpl(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, Person.class);
    }
}
