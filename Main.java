package javaprojectstudent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Amir", family = "Hosseini", codemeli = "4981245471", reshte = "software engineer", avrg = "11.25";
        System.out.print("Enter your name : ");
        String name2 = input.next();
        System.out.print("\nEnter your passwrod: ");
        String password;
        password = input.next();

        if (codemeli.equals(password) == true && name.equals(name2) == true) {
            {
                System.out.println("information accept:\nname:" + name + "\nfamily:" + family + "\ncode meli:" + codemeli
                        + "\nreshteh:" + reshte + "\naverage:" + avrg);
                System.out.println("\n your average is too low");

            }
        } else {

            System.out.println("student not found");
        }

    }

}
