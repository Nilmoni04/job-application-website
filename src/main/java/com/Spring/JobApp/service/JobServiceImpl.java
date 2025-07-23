package com.Spring.JobApp.service;

import com.Spring.JobApp.model.Job;
import com.Spring.JobApp.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepo;

    @Override
    public List<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    @Override
    public Job getJobById(int id) {
        return jobRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found with id " + id));
    }

    @Override
    public String createNewJob(Job job) {
        jobRepo.save(job);
        return "Job created successfully";
    }

    @Override
    public String deleteJob(int id) {
        if (jobRepo.existsById(id)) {
            jobRepo.deleteById(id);
            return "Job deleted...";
        } else {
            return "Job not found by id";
        }
    }

    @Override
    public String updateJob(int id, Job updatedJob) {
        return jobRepo.findById(id).map(job -> {
            job.setTitle(updatedJob.getTitle());
            job.setCompany(updatedJob.getCompany());
            job.setLocation(updatedJob.getLocation());
            job.setDescription(updatedJob.getDescription());
            jobRepo.save(job);
            return "Job updated successfully!";
        }).orElse("Job not found!");
    }
}
