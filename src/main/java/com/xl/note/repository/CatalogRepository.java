package com.xl.note.repository;

import java.util.List;

import com.xl.note.domain.Catalog;
import com.xl.note.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Catalog 仓库.
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long>{
	
	/**
	 * 根据用户查询
	 */
	List<Catalog> findByUser(User user);
	
	/**
	 * 根据用户查询
	 */
	List<Catalog> findByUserAndName(User user,String name);
}
