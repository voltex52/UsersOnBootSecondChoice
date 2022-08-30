package mycrud.usersonbootsecondchoice.dao;

import mycrud.usersonbootsecondchoice.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    User find(int id);

    void save(User user);

    void update(int id, User updateUser);

    void delete(int id);
}
