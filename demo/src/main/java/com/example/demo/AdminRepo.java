package com.example.demo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer> {
    Admin findByUsername(String username);
    @Query("select h from Admin h where username=?1 and password=?2")
	Optional<Admin> findByUsernameAndPassword(String enddateandtime,String Username);

}
