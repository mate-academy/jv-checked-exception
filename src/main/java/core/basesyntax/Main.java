package main;

import services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // Test cases
        userService.registerUser("john_doe", "securePass123", "securePass123"); // Success
        userService.registerUser("jane_doe", "short", "short"); // Failure
        userService.registerUser("alice", "password123", "differentPassword"); // Failure
    }
}

