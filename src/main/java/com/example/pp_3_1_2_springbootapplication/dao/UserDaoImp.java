package com.example.pp_3_1_2_springbootapplication.dao;

import com.example.pp_3_1_2_springbootapplication.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> query = entityManager.createQuery("FROM User", User.class);
        return query.getResultList();
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User updateUser) {
        User user = getUser(updateUser.getId());
        user.setName(updateUser.getName());
        user.setLastName(updateUser.getLastName());
        user.setAge(updateUser.getAge());
        entityManager.persist(user);
    }

    @Override
    public void delete(int id) {
        User removeUser = entityManager.find(User.class, id);
        entityManager.remove(removeUser);
    }
}
