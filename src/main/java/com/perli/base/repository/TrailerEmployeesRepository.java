package com.perli.base.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.perli.base.entity.TrailerEmployees;

@Repository
public interface TrailerEmployeesRepository extends JpaRepository<TrailerEmployees, Serializable>{
	
	List<TrailerEmployees> getByidTrailer(@Param("idTrailer") Integer idTrailer);
	
	
	@Query(value = "select e "
			     + "from TrailerEmployees e "
			     + "where idTrailer = :idTrailer and "
			           + "movementType = 'A'", nativeQuery = false)
	List<TrailerEmployees> getPost(@Param("idTrailer") Integer idTrailer, Pageable pageable);
	
	@Query(value = "select e "
		     + "from TrailerEmployees e "
		     + "where idTrailer = :idTrailer and "
		           + "movementType = 'B'", nativeQuery = false)
	List<TrailerEmployees> getDelete(@Param("idTrailer") Integer idTrailer, Pageable pageable);
	
	@Query(value = "select e "
		     + "from TrailerEmployees e "
		     + "where idTrailer = :idTrailer and "
		           + "movementType = 'M' "
		     + "ORDER BY movementDate DESC", nativeQuery = false)
	List<TrailerEmployees> getPut(@Param("idTrailer") Integer idTrailer, Pageable pageable);
	
}