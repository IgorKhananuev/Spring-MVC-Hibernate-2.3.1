package web.userService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.userDao.UserDaoImpl;

import java.util.Map;


@Service
public class UserServiceImpl implements UserService {
    private final UserDaoImpl userDaoImpl = new UserDaoImpl();


    @Override
    @Transactional
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
