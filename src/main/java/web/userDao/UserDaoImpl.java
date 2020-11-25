package web.userDao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.HashMap;
import java.util.Map;


@Repository
public class UserDaoImpl implements UserDao {
    private final Map<Long, User> allUsers = new HashMap<>();

    @Override
    public Map<Long, User> getAllUser() {
        return allUsers;
    }

    @Override
    public void add(User user) {
        allUsers.put(user.getId(), user);

    }

    @Override
    public void delete(User user) {
        allUsers.remove(user.getId(), user);
    }

    @Override
    public void edit(User user) {
        allUsers.put(user.getId(),user);
    }
}
