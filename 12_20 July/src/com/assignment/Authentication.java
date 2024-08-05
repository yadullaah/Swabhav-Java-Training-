package com.assignment;

import com.exceptions.EmailNotValidException;
import com.exceptions.PasswordNotValidException;

public class Authentication {
    private String email;
    private String password;

    public Authentication(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            throw new EmailNotValidException();
        }
        this.email = email;
        System.out.println("Email Validated");
    }

    public void setPassword(String password) {
        if (password.length() < 8 || !passwordValidate(password)) {
            throw new PasswordNotValidException();
        }
        this.password = password;
        System.out.println("Password Validated");
    }

    @Override
    public String toString() {
        return "Authentication [Email=" + email + ", password=" + password + "]";
    }

    private boolean passwordValidate(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialCharacter = true;
            }
        }
        return hasDigit && hasLowerCase && hasSpecialCharacter && hasUpperCase;
    }
}
