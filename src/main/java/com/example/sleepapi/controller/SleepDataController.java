package com.example.sleepapi.controller;

import com.example.sleepapi.model.SleepData;
import com.example.sleepapi.repository.SleepDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sleep")
public class SleepDataController {

    @Autowired
    private SleepDataRepository repository;

    // ✅ データの保存
    @PostMapping
    public SleepData saveSleepData(@RequestBody SleepData data) {
        return repository.save(data);
    }

    // ✅ ユーザーごとのデータ取得（任意）
    @GetMapping("/{userId}")
    public List<SleepData> getByUser(@PathVariable String userId) {
        return repository.findByUserId(userId);
    }
}
