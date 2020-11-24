package web.userService;

import web.model.User;

import java.util.Map;

public interface UserService {
    Map<Long, User> getAllUser();
    void add (User user);
    void delete (User user);
    void edit(User user);
}
