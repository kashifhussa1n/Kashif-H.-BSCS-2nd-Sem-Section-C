package WORKSHEET_Q5;

import java.util.Objects;

public class Patient {
    private String firstName;
    private String lastName;
    private int healthCardNumber;

    public Patient() {
        this("unknown", "unknown", -1);
    }

    public Patient(String firstName, String lastName, int healthCardNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.healthCardNumber = healthCardNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }
        if (other == null) { return false; }
        if (!(other instanceof Patient)) { return false; }
        Patient that = (Patient) other;
        return this.firstName.equals(that.firstName)
            && this.lastName.equals(that.lastName)
            && this.healthCardNumber == that.healthCardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName, this.healthCardNumber);
    }
}