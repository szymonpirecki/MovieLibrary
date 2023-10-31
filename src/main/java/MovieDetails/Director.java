package MovieDetails;

public record Director(String firstName, String lastName) {
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
