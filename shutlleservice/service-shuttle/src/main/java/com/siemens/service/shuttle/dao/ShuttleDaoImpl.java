package com.siemens.service.shuttle.dao;

import com.siemens.service.shuttle.entity.Shuttle;
import com.siemens.service.shuttle.entity.Shuttle_;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ShuttleDaoImpl implements ShuttleDao {

  @PersistenceContext
  private EntityManager em;

  @Override
  @Transactional
  public Shuttle addShuttle(Shuttle shuttle) {
    return em.merge(shuttle);
  }

  @Override
  @Transactional
  public Shuttle updateShuttle(Shuttle shuttle) {
    return em.merge(shuttle);
  }

  @Override
  @Transactional
  public boolean deleteShuttle(Shuttle shuttle) {

    final long shuttleId = shuttle.getId();
    em.remove(shuttle);
    if (em.find(Shuttle.class, shuttleId) != null) {
      return false;
    }

    return true;
  }

  @Override
  @Transactional
  public Shuttle getShuttle(long shuttleId) {
    return em.find(Shuttle.class,shuttleId);
  }

  @Override
  @Transactional
  public List<Shuttle> listShuttle() {
    CriteriaQuery<Shuttle> criteriaQuery = em.getCriteriaBuilder().createQuery(Shuttle.class);
    @SuppressWarnings("unused")
    Root<Shuttle> root = criteriaQuery.from(Shuttle.class);
    return em.createQuery(criteriaQuery).getResultList();
  }

  @Override
  @Transactional
  public List<Shuttle> listShuttle(long deviceId) {
    CriteriaQuery<Shuttle> criteriaQuery = em.getCriteriaBuilder().createQuery(Shuttle.class);
    Root<Shuttle> root = criteriaQuery.from(Shuttle.class);
    criteriaQuery.where(em.getCriteriaBuilder().equal(root.get(Shuttle_.deviceId), deviceId));
    return em.createQuery(criteriaQuery).getResultList();
  }
}
