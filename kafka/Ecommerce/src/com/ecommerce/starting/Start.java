package com.ecommerce.starting;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import com.ecommerce.newuserdata.Test_1;

public class Start {

	public static void main(String[] args) throws IOException {
			System.out.println("welcome to ecommerce app");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				System.out.println("press 1 to add user");
				System.out.println("presss 2 to delete user");
				System.out.println("press 3 to display users");
				System.out.println("press 4 to exit the app");
				System.out.println("press 5 to exit the app");
				int c = Integer.parseInt(br.readLine());
				if(c==1) {
					//code to add user
					Scanner sc= new Scanner(System.in);
					System.out.println("Enter your userid");
					int userid=sc.nextInt();
					System.out.println("Enter Your name");
					String uname= sc.next();
					System.out.println("Enter your email");
					String email= sc.next();
					System.out.println("Enter your username");
					String username= sc.next();
					System.out.println("Enter your password");
					String password=sc.next();
					//create student object//
					Test_1 st = new Test_1();
					boolean answer =st.InsertUserToDb(null);
					if(answer) {
						System.out.println("user is added successfully");
					}else {
						System.out.println("something went wrong...try again");
					}
					System.out.println(st);
					
				}else if(c==2) {
					//code to delete student
					System.out.println("enter user id to delete");
					int userId=Integer.parseInt(br.readLine());
					boolean f=Test_1.deleteuser(userId);
					if(f) {
						System.out.println("entry of user deleted successfully");
					}else {
						System.out.println("something went wrong...try again");
					}
				}else if(c==3) {
					
					//code to display student
					Test_1.showAllusers();
				}else if(c==4) {
					//display the products//
					
				}else if(c==5) {
					break;
				}
			}
			System.out.println("thank you for using may appalication");
			System.out.println("see you soon***Bye!");
			

		}

	}
