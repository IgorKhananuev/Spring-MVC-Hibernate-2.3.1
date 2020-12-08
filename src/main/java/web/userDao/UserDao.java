package web.userDao;

import web.model.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getAllUsers();
    void add (User user);
    User findUserById (Long id);
    void delete (User user);
    User edit(User user);

}
