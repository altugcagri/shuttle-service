package com.siemens.service.shuttle.dao;

import com.siemens.service.shuttle.entity.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDaoImpl implements UserDao {

  @PersistenceContext
  private EntityManager em;

  @Override
  @Transactional
  public User addUser(User user) {
    return em.merge(user);
  }

  @Override
  @Transactional
  public User updateUser(User user) {
    return em.merge(user);
  }

  @Override
  @Transactional
  public boolean deleteUser(User user) {

    final long userId = user.getId();
    em.remove(user);
    if (em.find(User.class, userId) != null) {
      return false;
    }

    return true;
  }

  @Override
  @Transactional
  public User getUser(long userId) {
    return em.find(User.class, userId);
  }

  @Override
  @Transactional
  public List<User> listUser() {
    CriteriaQuery<User> criteriaQuery = em.getCriteriaBuilder().createQuery(User.class);
    @SuppressWarnings("unused")
    Root<User> root = criteriaQuery.from(User.class);
    return em.createQuery(criteriaQuery).getResultList();
  }
 /*
  @Override
  @Transactional
  public List<User> listEmployee(String cardId) {
    CriteriaQuery<User> criteriaQuery = em.getCriteriaBuilder().createQuery(User.class);
    Root<User> root = criteriaQuery.from(User.class);
    criteriaQuery.select(root);
    criteriaQuery.where(em.getCriteriaBuilder().equal(root.get(User_.cardId), cardId));
    return em.createQuery(criteriaQuery).getResultList();
  }
*/
}
