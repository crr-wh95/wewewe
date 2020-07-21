package com.crr.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityareaRepository extends JpaRepository<com.crr.domain.Cityarea,Integer> {
}
