package com.ecommerce.userdata;
import java.util.Scanner;
import com.ecommerce.userlogin.Register;


public class Registration {

    static Register register = new Register();

    public static void NewUser() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter userid => ");
            int userid = scanner.nextInt();
            register.setUserId(userid);

            System.out.print(" Enter lastName => ");
            String userName = scanner.nextLine();
            register.setuName(userName);

            System.out.print(" Enter useremail => ");
            String Email = scanner.nextLine();
            register.setEmail(Email);

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();
            register.setPassword(password);

           
           
        }
    }
}