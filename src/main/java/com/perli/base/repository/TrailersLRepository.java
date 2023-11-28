package com.perli.base.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.perli.base.entity.TrailersList;

@Repository
public interface TrailersLRepository extends JpaRepository<TrailersList, Serializable>{
	
	@Query(value = "SELECT t "
	         + "FROM TrailersList t "
	         + "WHERE t.idTrailer = :idTrailer", nativeQuery = false)
	TrailersList getById(@Param("idTrailer") Integer idTrailer);

}
