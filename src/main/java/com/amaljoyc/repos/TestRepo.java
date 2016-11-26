package com.amaljoyc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amaljoyc.models.Test;

public interface TestRepo extends JpaRepository<Test, String> {
}
