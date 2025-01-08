package peaksoft;

import peaksoft.models.Student;
import peaksoft.models.User;


import java.util.Scanner;


import peaksoft.models.Group;

public class Main {
    static Scanner scannerStr = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);


    public static void main(String[] args) {


//         -- TODO  create branch
//          git branch fature/urmat

//      TODO  bashka branchke otyy
//       git checkout fature/urmat
//
//         -- TODO Проверка статуса и истории and push
//          git status
//       TODO   git add .
//         git status
//         git commit -m "git method"
//         git push -u origin fature/urmat

        User user = new User();
        user.setId(1L);
        user.setEmail("Aibek");
        user.setFirstName("Aibek1");
        user.setLastName("Aibek2");
        Group group = new Group();
        group.setId(1L);
        group.setGroupName("Group 1");
        group.setDescription("Group 2");

        Student student = new Student();
        student.setEmail("Aibek");
        student.setFirstName("Aibek1");








        while (true) {

            System.out.print("""
                    PRESS TO -> 1. ADD USER
                    PRESS TO -> 2. GET ALL USERS
                    PRESS TO -> 3. DELETE USER BY ID
                    PRESS TO -> 4. UPDATE USER
                    PRESS TO -> 5. GET ALL BY ID USER
                    
                    
                    """);
            System.out.print("command: ");
            int command = scannerInt.nextInt();
            switch (command) {
                case 1 -> {
                    System.out.println("add newUser");

                    User.addUser(newUser());
                }
                case 2 -> {
                    System.out.println("get all");
                    System.out.println(User.getUsers());

                }
                case 3 -> {
                    System.out.println("delete newUser");
                    System.out.print("id newUser : ");
                    Long id = scannerInt.nextLong();
                    User.deleteUserById(id);
                }
                case 4 -> {
                    System.out.println("update newUser");
                    System.out.print("id newUser : ");
                    Long id = scannerInt.nextLong();
                    System.out.println(User.updateUserById(id, newUser()));

                }
                case 5 -> {
                    System.out.println("get all by ID user");
                    System.out.print("id User : ");
                    Long id = scannerInt.nextLong();
                    System.out.println(User.getUserById(id));

                }
            }

        }


    }

    public static User newUser() {

        System.out.print("id :");
        Long id = scannerInt.nextLong();
        System.out.print("first name: ");
        String firstName = scannerStr.nextLine();
        System.out.print("last name: ");
        String lastName = scannerStr.nextLine();
        System.out.print("email: ");
        String email = scannerStr.nextLine();
        System.out.print("password: ");
        String password = scannerStr.nextLine();
        return new User(id, firstName, lastName, email, password);
    }
}