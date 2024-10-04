package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("John", "Dodade", (byte) 22);
        userService.saveUser("Jane", "Smith", (byte) 33);
        userService.saveUser("Alice", "Johnson", (byte) 22);
        userService.saveUser("Bob", "Brown", (byte) 21);
        System.out.println("Список пользователей:");
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
