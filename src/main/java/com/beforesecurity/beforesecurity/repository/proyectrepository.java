package com.beforesecurity.beforesecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beforesecurity.beforesecurity.model.Project;

@Repository
public interface proyectrepository extends JpaRepository<Project, Long>{

}
