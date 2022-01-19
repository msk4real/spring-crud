package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


@Repository
public class UserDaoImpl implements UserDao {

    private static final Logger logger = Logger.getLogger("UserDaoImpl.class");

    private static int people_count;
    private List<User> users;

    {
        users = new ArrayList<>(300);

        users.add(new User(++people_count, "Karim", "Samatov", "Engineer"));
        users.add(new User(++people_count, "Ruslan", "Samatov", "Bartander"));
        users.add(new User(++people_count, "Zamira", "Samatova", "Student"));
    }

    @Override
    public List<User> allUsers() {
        return users;
    }

    @Override
    public void delete(int id) {
        users.removeIf(u -> u.getId() == id);
    }

    @Override
    public void edit(int id, User user) {
        User userToUpdated = getById(id);
        userToUpdated.setName(user.getName());
        userToUpdated.setSurname(user.getSurname());
        userToUpdated.setProfession(user.getProfession());
    }

    @Override
    public User getById(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public void save(User user) {
        user.setId(++people_count);
        users.add(user);
    }
}
