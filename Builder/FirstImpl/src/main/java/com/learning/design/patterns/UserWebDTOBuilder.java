package com.learning.design.patterns;

import java.time.LocalDate;
import java.time.Period;

// The concrete builder for first.implementation.UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;

    private UserWebDTO userWebDTO;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        Period ageInYears = Period.between(birthday, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n" + address.getCity() + "\n" + address.getState() + " " + address.getZipCode();
        return this;
    }

    @Override
    public UserDTO build() {
        userWebDTO = new UserWebDTO(firstName + " " + lastName, address, age);
        return userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userWebDTO;
    }

}
