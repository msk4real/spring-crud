package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> allUsers();
    void delete(int id);
    void edit(int id, User user);
    User getById(int id);
    void save(User user);
}
