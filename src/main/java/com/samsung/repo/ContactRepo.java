package com.samsung.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.samsung.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact,Long>{
	boolean existsByMobile(String mobile);//Pascal notation of mobile column
	boolean existsByEmail(String email);
	List<Contact> findAll();
	List<Contact> findByFullName(String fullName);
	Optional<Contact> findById(Long mobile);
	Contact findByMobile(String mobile);
	Contact findByEmail(String email);

}