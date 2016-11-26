package com.amaljoyc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amaljoyc.models.Model;

public interface ModelRepo extends JpaRepository<Model, String> {
}