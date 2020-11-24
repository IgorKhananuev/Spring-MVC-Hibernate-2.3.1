package web.userService;

import web.model.User;
import web.userDao.UserDaoImpl;

import java.util.Map;

public class UserServiceImpl implements UserService {
    private final UserDaoImpl userDaoImpl = new UserDaoImpl();


    @Override
    public Map<Long, User> getAllUser() {
        return userDaoImpl.getAllUser();
    }

    @Override
    public void add(User user) {
        userDaoImpl.add(user);

    }

    @Override
    public void delete(User user) {
        userDaoImpl.delete(user);
    }

    @Override
    public void edit(User user) {
        userDaoImpl.edit(user);

    }
}
