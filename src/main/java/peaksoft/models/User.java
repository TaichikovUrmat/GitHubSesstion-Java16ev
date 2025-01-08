package peaksoft.models;

import java.util.ArrayList;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private static ArrayList<User> users = new ArrayList<>();

    public User() {
    }

    public User(Long id, String firstName, String lastName, String email, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void addUser  (User user) {
        users.add(user);
    }
    public static ArrayList<User> getUsers() {
        return users;
    }
    public static User getUserById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;

            }

        }
        System.out.println("User not found");
        return null;
    }
    public static boolean deleteUserById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                users.remove(user);

                return true;
            }
        }
        System.out.println("User not found");
        return false;
    }
    public static User updateUserById(Long id, User newUser) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setFirstName(newUser.getFirstName());
                user.setLastName(newUser.getLastName());
                user.setEmail(newUser.getEmail());
                user.setPassword(newUser.getPassword());
                System.out.println("successfull uptade");
                return user;

            }

        }
        System.out.println("User not found");
        return null;
    }




    @Override
    public String toString() {
        return "        User \n" +
               "id        : " + id +'\n'+
               "firstName : " + firstName + '\n' +
               "lastName  : " + lastName + '\n' +
               "email     : " + email + '\n' +
               "password  : " + password + "\n\n";
    }

}
