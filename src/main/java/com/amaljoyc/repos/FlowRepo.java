package com.amaljoyc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amaljoyc.models.Flow;

public interface FlowRepo extends JpaRepository<Flow, String> {
}
