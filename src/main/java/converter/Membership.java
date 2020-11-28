package converter;

import java.util.Objects;

/**
 * @author 1851594王思桐
 */
class Membership {
    private final String firstName;
    private final String lastName;
    private final boolean isActive;
    private final String membershipId;

    /**
     * Constructor.
     *
     * @param firstName user's first name
     * @param lastName  user's last name
     * @param isActive  flag indicating whether the user is active
     * @param membershipId    user's identificator
     */
    public Membership(String firstName, String lastName, boolean isActive, String membershipId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.membershipId = membershipId;
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

    public String getMembershipId() {
        return membershipId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Membership membership = (Membership) o;
        return isActive == membership.isActive && Objects.equals(firstName, membership.firstName) && Objects
                .equals(lastName, membership.lastName) && Objects.equals(membershipId, membership.membershipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, isActive, membershipId);
    }

    @Override
    public String toString() {
        return "Membership:("+this.hashCode()+"):{" + "\n\t\tfirstName='" + firstName + '\'' + ",\n\t\tlastName='" + lastName + '\''
                + ",\n\t\tisActive=" + isActive + ",\n\t\tmembershipId='" + membershipId + '\'' + '}';
    }
}
