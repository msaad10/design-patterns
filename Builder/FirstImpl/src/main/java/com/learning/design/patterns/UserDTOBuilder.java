package com.learning.design.patterns;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String fname);
    UserDTOBuilder withLastName(String lname);
    UserDTOBuilder withBirthday(LocalDate birthday);
    UserDTOBuilder withAddress(Address address);

    // Method to "assemble" final product
    UserDTO build();
    // Optional method to fetch already built object
    UserDTO getUserDTO();
}
