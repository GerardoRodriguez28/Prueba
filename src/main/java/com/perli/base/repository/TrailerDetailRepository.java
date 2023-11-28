package com.perli.base.repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.perli.base.entity.Trailers;

@Repository
public interface TrailerDetailRepository extends JpaRepository<Trailers, Serializable>{
	
	@Query(value = "SELECT t "
		     + "FROM Trailers t", nativeQuery = false)
	List<Trailers> getLastRecord(Pageable pageable);

}