package com.perli.base.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.perli.base.entity.TrailerDetail;

@Repository
public interface TrailerRepository extends JpaRepository<TrailerDetail, Serializable>{
	
	@Query(value = "SELECT d "
			     + "FROM TrailerDetail d JOIN d.trailers t JOIN t.statusProcess p "
			     + "WHERE t.idTrailer = :idTrailer", nativeQuery = false)
	TrailerDetail getByTrailerNumber(@Param("idTrailer") Integer idTrailer);
			
}

