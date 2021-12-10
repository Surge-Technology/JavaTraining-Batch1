package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserDetailsRepo extends JpaRepository<UserDetails, Long>{

}
