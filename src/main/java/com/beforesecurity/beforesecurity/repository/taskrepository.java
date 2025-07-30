package com.beforesecurity.beforesecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beforesecurity.beforesecurity.model.Task;

@Repository
public interface taskrepository extends JpaRepository<Task, Long> {

}
