package Converter;

import java.util.Objects;

/**
 * User DTO class.
 */
class MembershipDto {

    private final String firstName;
    private final String lastName;
    private final boolean isActive;
    private final String email;

    /**
     * Constructor.
     *
     * @param firstName user's first name
     * @param lastName  user's last name
     * @param isActive  flag indicating whether the user is active
     * @param email     user's email address
     */
    public MembershipDto(String firstName, String lastName, boolean isActive, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MembershipDto membershipDto = (MembershipDto) o;
        return isActive == membershipDto.isActive && Objects.equals(firstName, membershipDto.firstName) && Objects
                .equals(lastName, membershipDto.lastName) && Objects.equals(email, membershipDto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, isActive, email);
    }

    @Override
    public String toString() {
        return "MembershipDto:("+this.hashCode()+"):{" + "\n\t\tfirstName='" + firstName + '\'' + ", \n\t\tlastName='" + lastName + '\''
                + ",\n\t\tisActive=" + isActive + ",\n\t\temail='" + email + '\'' + '}';
    }
}