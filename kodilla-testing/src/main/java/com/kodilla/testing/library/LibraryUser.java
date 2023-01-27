package com.kodilla.testing.library;

public class LibraryUser {
    private String firstName;
    private String lastName;
    private String peselId;

    public LibraryUser(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPeselId() {
        return peselId;
    }

    public void setPeselId(String peselId) {
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser that)) return false;

        if (!getFirstName().equals(that.getFirstName())) return false;
        if (!getLastName().equals(that.getLastName())) return false;
        return getPeselId().equals(that.getPeselId());
    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getPeselId().hashCode();
        return result;
    }
    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}
