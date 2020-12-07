package web.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.userDao.UserDaoImpl;

import java.util.List;



@Service
public class UserServiceImpl implements UserService {

    private final UserDaoImpl userDaoImpl = new UserDaoImpl();


    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDaoImpl.getAllUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDaoImpl.add(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        userDaoImpl.delete(user);
    }

    @Override
    @Transactional
    public void edit(User user) {
        userDaoImpl.edit(user);

    }
}
