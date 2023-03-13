package com.company.client;

import com.company.model.Employee;
import com.company.service.CredentialService;
import com.company.service.CredentialServiceImpl;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String firstName = "Harshit";
        String lastName = "Choudhary";
        String generatedEmail = null;
        String generatedPassword = null;
        Employee employee = new Employee(firstName,lastName);
        CredentialService credentialService = new CredentialServiceImpl();
        System.out.println("Enter the details");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1: {
                generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
                        employee.getLastName().toLowerCase(), "tech");
                generatedPassword = credentialService.generateCredentials(12);
                
                break;
            }
            case 2: {
                generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
                        employee.getLastName().toLowerCase(), "adm");
                generatedPassword = credentialService.generateCredentials(12);
                break;
            }
            case 3: {
                 generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
                        employee.getLastName().toLowerCase(), "hr");
                 generatedPassword = credentialService.generateCredentials(12);
                break;
            }
            case 4: {
                generatedEmail = credentialService.generateEmailAddress(employee.getFirstName().toLowerCase(),
                        employee.getLastName().toLowerCase(), "legal");
                generatedPassword = credentialService.generateCredentials(12);
                break;
            }
            default: {
                System.out.println("Enter a valid option");
            }

        }
        System.out.println("The Email is " + generatedEmail);
        System.out.println("The Password is " + generatedPassword);

    }
}
