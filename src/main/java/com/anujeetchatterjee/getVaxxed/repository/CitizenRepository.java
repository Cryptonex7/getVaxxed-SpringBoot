package com.anujeetchatterjee.getVaxxed.repository;

import com.anujeetchatterjee.getVaxxed.models.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
    List<Citizen> findByName(String name);
}
