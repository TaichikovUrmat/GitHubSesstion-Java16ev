package peaksoft.models;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public Student(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
