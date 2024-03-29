package com.fortinosandoval.datajpa.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.fortinosandoval.datajpa.models.entity.Cliente;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("clienteDaoJPA")
public class ClienteDaoImpl implements IClienteDao {

  @PersistenceContext
  private EntityManager em;

  @SuppressWarnings("unchecked")
  @Transactional(readOnly = true)
  @Override
  public List<Cliente> findAll() {
    return em.createQuery("from Cliente").getResultList();
  }

}