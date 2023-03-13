package com.company.service;

import com.company.model.Employee;

public interface CredentialService {
    String generateEmailAddress(String firstName, String lastName, String emailAddress);
    String generateCredentials(int maxlength);
    void displayCredentials(Employee employee);


}