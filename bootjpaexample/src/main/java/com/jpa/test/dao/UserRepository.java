package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	// By Custom finder method-
//	public List<User> findByName(String name);

//	public List<User> findByNameAndCity(String name, String city);

	// By Executing Query-
//	@Query ("select u From User u")
//	public List<User> getAllUser ();
//	
//	
//	
//	@Query("select u From User u Where u.name=:n")
//	public List<User> getByName(@Param("n") String name);
//	
//	
//	@Query("select u From User u Where u.name=:n and u.city=:c")
//	public List<User> getByNameAndCity (@Param("n") String name,  @Param("c") String city);

}
