package com.objis.springinject.service;

import com.objis.springinject.dao.ClientDaoImpl;
import com.objis.springinject.dao.IClientDao;
import com.objis.springinject.domaine.Client;

public class ClientService {

	ClientDaoImpl dao; //Injection de la classe

	public ClientDaoImpl getDao() {
		return dao;
	}

	public void setDao(ClientDaoImpl dao) {
		this.dao = dao;
	}

	public String insererClient(Client client) {
		return dao.ajouterClient(client);
	}

}
