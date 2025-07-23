package com.Spring.JobApp.service;

import com.Spring.JobApp.model.Job;

import java.util.List;

public interface JobService {
    List<Job> getAllJobs();
    Job getJobById(int id);
    String createNewJob(Job job);
    String deleteJob(int id);
    String updateJob(int id, Job updatedJob);
}
