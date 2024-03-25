package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("Мария"," Петрова",(byte)66);
        userService.saveUser("Петр"," Петров",(byte)57);
        userService.saveUser("Влад"," Владислав",(byte)52);
        userService.saveUser("Елена","Смирнова",(byte)66);

        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
