package com.amaljoyc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amaljoyc.models.Page;

public interface PageRepo extends JpaRepository<Page, String> {
}