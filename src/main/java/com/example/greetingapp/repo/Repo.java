package com.example.greetingapp.repo;


import com.example.greetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Greeting ,Long> {

}
