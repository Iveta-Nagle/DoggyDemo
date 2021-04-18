package com.example.demo.repository;

import com.example.demo.model.Doggy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoggyRepository extends JpaRepository<Doggy, Integer> {

    List<Doggy> findAllByName(String name);
}
