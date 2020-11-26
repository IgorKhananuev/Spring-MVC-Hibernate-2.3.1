package web.userDao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class UserDaoImpl implements UserDao {
    private final Map<Long, User> allUsers = new HashMap<>();

    private LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean;

    @Autowired
    public void setLocalContainerEntityManagerFactoryBean(LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean){
        this.localContainerEntityManagerFactoryBean = localContainerEntityManagerFactoryBean;
    }

    public List<User> allUsers() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();
        return  em.createQuery("From users").getResultList();
     }

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
