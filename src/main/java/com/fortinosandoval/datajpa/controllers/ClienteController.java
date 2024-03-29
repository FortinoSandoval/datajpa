package com.fortinosandoval.datajpa.controllers;

import com.fortinosandoval.datajpa.models.dao.IClienteDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {

  @Autowired
  @Qualifier("clienteDaoJPA")
  private IClienteDao clienteDao;
  
  @RequestMapping(value = "/findall", method = RequestMethod.GET)
  public String findAll(Model model) {
    model.addAttribute("titulo", "Listado de clientes");
    model.addAttribute("clientes", clienteDao.findAll());
    return "listado";
  }
}