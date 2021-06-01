package com.company;

public class Passenger {
    private static Address address;
    private static Contact contact;
    private int id;

    public Passenger(String addressState, String addressCity,
                     String addressStreet, String contactName, String contactPhone,
                     String contactEmail) {
        this.address = new Address(addressState, addressCity, addressStreet);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
        ;
    }

    public Passenger() {
        this("Maharashtra", "Pune", "sadashiv peth", "Shashikant", "123456789", "sh@gmail.com");
    }

    //private Contact getContact(){ }
    //private Address getAddress(){ }

    public String getAddressDetails() {
        return "Passenger address is: " + address.state + " " + address.city + " " + address.street;
    }

    public void updateAddressDetails(String addressDetail) {
        addressDetail = getAddressDetails();
    }

    public void updateContactDetails(String contactDetail) {
        contactDetail = getContactDetails();
    }

    public String getContactDetails() {
        return "Passenger name is: " + contact.name + " EmailId: " + contact.email + " Phone Number is: " + contact.phone;
    }

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public Address() {
            this("sadshivpeth", "Pune", "Maharashtra");
        }
    }

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public Contact() {
            this("Asawari", "123456789", "Asawari@gmail.com");
        }
    }


}