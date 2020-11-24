package web.userDao;

import web.model.User;

import java.util.Map;

interface UserDao {
    Map<Long, User> getAllUser();
    void add (User user);
    void delete (User user);
    void edit(User user);
}
