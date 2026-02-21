package app;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. List Students");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            }catch (NumberFormatException e){
                System.out.println("Invalid input. Enter a number.\n");
                continue;
            }

            if (choice==1){
                int id = readInt(scanner, "ID: ");
                System.out.println("Name: ");
                String name = scanner.nextLine().trim();
                int age = readInt(scanner, "Age: ");

                service.addStudent(new Student(id, name, age));
                System.out.println("Student added.\n");

            } else if (choice == 2) {
                int id = readInt(scanner, "Enter ID to remove: ");
                boolean removed = service.removeStudentById(id);
                System.out.println(removed ? "Removed.\n": "Student not found.\n");

            } else if (choice == 3) {
                if (service.getAllStudents().isEmpty()){
                    System.out.println("No students.\n");
                }else{
                    for (Student s : service.getAllStudents()){
                        System.out.println(s.getId() + " - " + s.getName() + " (" + s.getAge() + ")");
                    }
                    System.out.println();
                }
            } else if (choice == 4 ) {
                System.out.println("Bye.");
                break;
            }else {
                System.out.println("Invalid choice.\n");
            }
        }
        scanner.close();
    }
    private static int readInt(Scanner scanner, String promt){
        while (true){
            System.out.println(promt);
            String line = scanner.nextLine().trim();
            try {
                return Integer.parseInt(line);

            }catch (NumberFormatException e){
                System.out.println("Invalid number. Try again.");
            }
        }
    }

}