package web.userService;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void add (User user);
    void delete (User user);
    void edit(User user);
}
