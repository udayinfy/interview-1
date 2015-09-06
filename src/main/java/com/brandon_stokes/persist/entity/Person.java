package com.brandon_stokes.persist.entity;

import com.brandon_stokes.persist.dao.PersonDaoImpl;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;
import java.util.Objects;

@DatabaseTable(daoClass = PersonDaoImpl.class)
public class Person implements Serializable {

    public static final String LAST_NAME_FIELD= "lastName";
    public static final String FIRST_NAME_FIELD = "firstName";
    public static final String AGE_FIELD = "age";

    @DatabaseField(generatedId = true, canBeNull = false)
    private Long id;

    @DatabaseField(columnName = LAST_NAME_FIELD, canBeNull = false)
    private String lastName;

    @DatabaseField(columnName = FIRST_NAME_FIELD, canBeNull = false)
    private String firstName;

    @DatabaseField(columnName = AGE_FIELD, canBeNull = false)
    private Integer age;

    public Person() {

    }

    public Person(String lastName, String firstName, Integer age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if ( ! Objects.equals(id, person.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", lastName='" + lastName + "'" +
                ", firstName='" + firstName + "'" +
                ", age='" + age + "'" +
                '}';
    }
}
