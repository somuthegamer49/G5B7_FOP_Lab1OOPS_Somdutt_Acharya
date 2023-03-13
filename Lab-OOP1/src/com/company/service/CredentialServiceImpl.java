package com.company.service;
import java.util.Random;
import com.company.model.Employee;

public class CredentialServiceImpl implements CredentialService {
    Random rand = new Random();
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lower_case = "abcdefghijklmnopqrstuvwxyz";
    private static final String nums = "1234567890";
    private static final String chars = "-_=+[]{}|;:'/?.>,<";
    @Override
    public String generateEmailAddress(String firstName, String lastName, String emailAddress) {
        return firstName + lastName + "@" + emailAddress + ".com";
    }

    @Override
    public String generateCredentials(int maxlength) {
        String password ="";
        String Password_Base = UPPER_CASE + nums + lower_case + chars;
        for(int i=0; i<maxlength; i++){
            int gen = rand.nextInt(Password_Base.length());
            password+= Password_Base.charAt(gen);
        }
        char[] passwordChars = password.toCharArray();
        for (int i=0; i < passwordChars.length; i++){
            int j = rand.nextInt(passwordChars.length);
            char temp = passwordChars[j];
            passwordChars[i]=passwordChars[j];
            passwordChars[j]=temp;
        }
        return new String(passwordChars);

    }

    @Override
    public void displayCredentials(Employee employee) {
        System.out.println();
    }
}
