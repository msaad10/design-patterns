package com.learning.design.patterns;

import java.time.LocalDate;

public class BuilderClient {
    public static void main(String[] args) {
        User user = createUser();
        UserWebDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    // Director
    private static UserDTO directBuild(UserWebDTOBuilder builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setFirstName("M.");
        user.setLastName("Saad");
        user.setBirthday(LocalDate.of(1998, 1, 20));
        Address address = new Address();
        address.setHouseNumber("1234");
        address.setStreet("Main Street");
        address.setCity("Austin");
        address.setState("TX");
        address.setZipCode("78759");
        user.setAddress(address);
        return user;
    }
}