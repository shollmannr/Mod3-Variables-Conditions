package Assignment;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        //gradeHomework(62);
        //dayOfWeek();
        typeOfNum();
    }

    public static void gradeHomework(int grade) {
        String note = "";
        if (grade >= 90) {
            note = "A";
        } else if (grade <= 89 && grade >= 80) {
            note = "B";
        } else if (grade <= 79 && grade >= 70) {
            note = "C";
        } else if (grade <= 69 && grade >= 55) {
            note = "D";
        } else {
            note = "F";
        }
        System.out.println("You received a " + note + " (" + grade + ")");
    }

    public static void dayOfWeek() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number between 1 - 7: ");
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Sunday");
                break;
            case 4:
                System.out.println("Sunday");
                break;
            case 5:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid input");
                // Calls the function again until the user puts a valid input.
                dayOfWeek();
                break;
        }
        scan.close();
    }

    public static void typeOfNum() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = scan.nextInt();

        // even
        if(num % 2 == 0) {
            if(num > 2 && num < 5) {
                System.out.println("Not Cool");
            } else if(num > 6 && num < 20) {
                System.out.println("Cool");
            } else if(num > 20) {
                System.out.println("Not cool");
            }
        // odd
        } else {
            System.out.println("Cool (odd)");
        }   
        scan.close();
    }
}