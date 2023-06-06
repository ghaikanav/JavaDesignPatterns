package org.designPatterns.creational.builder;

public class User {

    private String name;
    private Integer id;
    private Address address;

    public User (String name, Integer id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public  User () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private String name;
        private Integer id;
        private Address address;

        public UserBuilder name (String myName) {
           name = myName;
            return this;
        }

        public  UserBuilder id (Integer myId) {
            id = myId;
            return this;
        }

        public UserBuilder address (Address myAddress) {
            address = myAddress;
            return this;
        }

        public User build() {
            User user = new User();
            user.setId(id);
            user.setName(name);
            user.setAddress(address);
            return user;
        }
    }
}
