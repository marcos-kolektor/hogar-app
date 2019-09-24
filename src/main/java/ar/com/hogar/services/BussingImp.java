package ar.com.hogar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.hogar.repository.Repository;
import hogar.dao.TipoDao;

@Service
public class BussingImp implements BussingInt {
	
	@Autowired
	private Repository repository;

	public List<TipoDao> find() {
		return this.repository.findAll();
	}

}
