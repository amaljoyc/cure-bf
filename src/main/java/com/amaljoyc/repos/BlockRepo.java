package com.amaljoyc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amaljoyc.models.Block;

public interface BlockRepo extends JpaRepository<Block, String> {
}