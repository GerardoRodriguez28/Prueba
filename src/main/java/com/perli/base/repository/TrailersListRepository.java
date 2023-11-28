package com.perli.base.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.perli.base.entity.Units;

@Repository
public interface TrailersListRepository extends JpaRepository<Units, Serializable>{
	
	@Query(value = "SELECT u "
		         + "FROM Units u JOIN u.trailersList t "
		         + "WHERE u.idStatusProcess = 10 and "
		               + "t.idStatusProcess = 10 and "
		               + "t.idTrailer != 0 "
		           + "", nativeQuery = false)
	List<Units> getTrailerNumber(Pageable pageable);
	
	@Query(value = "SELECT count(u) "
	             + "FROM Units u JOIN u.trailersList t "
	             + "WHERE u.idStatusProcess = 10 and "
	                   + "t.idStatusProcess = 10 and "
	                   + "t.idTrailer != 0 ", nativeQuery = false)
	Integer getCountTrailers();
	
	@Query(value = "SELECT u "
            + "FROM Units u JOIN u.trailersList t "
            + "WHERE u.idStatusProcess = 10 and "
                  + "t.idStatusProcess = 10 and "
                  + "u.unitNumber = :unitNumber"
            + "", nativeQuery = false)
	List<Units> getUnitNumber(@Param("unitNumber") Integer unitNumber);
	
	@Query(value = "SELECT u "
            + "FROM Units u JOIN u.trailersList t "
            + "WHERE u.idStatusProcess = 10 and "
                  + "t.idStatusProcess = 10 and "
                  + "t.licensePlate = :licensePlate"
            + "", nativeQuery = false)
	List<Units> getLicensePlate(@Param("licensePlate") String licensePlate);
	
	@Query(value = "SELECT u "
            + "FROM Units u JOIN u.trailersList t "
            + "WHERE u.idStatusProcess = 10 and "
                  + "t.idStatusProcess = 10 and "
                  + "t.trailerNumber = :trailerNumber"
            + "", nativeQuery = false)
	List<Units> getTrailerNumber(@Param("trailerNumber") Integer trailerNumber);
	
}
