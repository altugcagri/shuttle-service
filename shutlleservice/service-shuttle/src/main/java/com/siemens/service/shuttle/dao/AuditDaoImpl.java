package com.siemens.service.shuttle.dao;

import com.siemens.service.shuttle.entity.Audit;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AuditDaoImpl implements AuditDao {

  @PersistenceContext
  private EntityManager em;

  @Override
  @Transactional
  public Audit addAudit(Audit audit) {
    return em.merge(audit);
  }

  @Override
  @Transactional
  public List<Audit> listAudit() {
    CriteriaQuery<Audit> criteriaQuery = em.getCriteriaBuilder().createQuery(Audit.class);
    @SuppressWarnings("unused")
    Root<Audit> root = criteriaQuery.from(Audit.class);
    return em.createQuery(criteriaQuery).getResultList();
  }
}
