package ar.com.hogar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hogar.dao.TipoDao;

public interface Repository extends JpaRepository<TipoDao, Long>{

}
