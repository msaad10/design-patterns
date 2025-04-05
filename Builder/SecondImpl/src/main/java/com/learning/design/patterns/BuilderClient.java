package com.learning.design.patterns;

import java.time.LocalDate;

public class BuilderClient {
    public static void main(String[] args) {
        com.learning.design.patterns.User user = createUser();
        UserDTO userDTO = directBuild(UserDTO.getBuilder(), user);
        System.out.println(userDTO);
    }

    // Director
    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    private static User createUser() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setBirthday(LocalDate.of(1998, 1, 30));
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("Main St");
        address.setCity("Los Angeles");
        address.setZipCode("90007");
        address.setState("CA");
        user.setAddress(address);
        return user;
    }
}
