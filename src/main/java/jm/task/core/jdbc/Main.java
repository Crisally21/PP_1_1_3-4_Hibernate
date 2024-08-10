package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();
        userDao.saveUser("Elandaev", "Vladimir", (byte) 23);
        userDao.saveUser("Kalmykov", "Pavel", (byte) 23);
        userDao.saveUser("Miroshnikov", "Roman", (byte) 25);
        userDao.saveUser("Stepanov", "Aleksand", (byte) 23);
        List<User> users = userDao.getAllUsers();
        System.out.println(users);
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
