package com.Spring.JobApp.repo;

import com.Spring.JobApp.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Integer> {
}
