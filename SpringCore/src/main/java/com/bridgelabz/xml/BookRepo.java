package com.bridgelabz.xml;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Long>{

//	@Query(value="select *from book", nativeQuery = true)
//	public List<BookEntity> getBook();
	
}
