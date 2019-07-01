package com.fortinosandoval.datajpa.models.dao;

import java.util.List;

import com.fortinosandoval.datajpa.models.entity.Cliente;

public interface IClienteDao {
  public List<Cliente> findAll();
}