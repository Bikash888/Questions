package com.test.questions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.questions.model.Test;

public interface TestRepo extends JpaRepository<Test,Long> {
}
