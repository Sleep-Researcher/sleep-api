package com.example.sleepapi.repository;

import com.example.sleepapi.model.SleepData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SleepDataRepository extends JpaRepository<SleepData, Long> {
    List<SleepData> findByUserId(String userId);
}
