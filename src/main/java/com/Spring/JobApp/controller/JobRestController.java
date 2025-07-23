package com.Spring.JobApp.controller;

import com.Spring.JobApp.model.Job;
import com.Spring.JobApp.repo.JobRepository;
import com.Spring.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/jobs")
public class JobRestController {
//    private List<Job> jobList = new ArrayList<>();
//
//    //get all jobs
//    @GetMapping
//    public List<Job> getAllJobs() {
//        return jobList;
//    }
//
//    //Get job by ID
//    @GetMapping("/{id}")
//    public Job getJobById(@PathVariable int id) {
//        return jobList.stream()
//                .filter(job -> job.getId() == id)
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("job Not fount with id " + id));
//    }
//
//    //Post new job
//    @PostMapping
//    public String createNewJob(@RequestBody Job job) {
//        job.setId(jobList.size()+1);
//        jobList.add(job);
//        return "Job Created Successfully!";
//    }
//
//    //Deleting a job
//    @DeleteMapping("/{id}")
//    public String deleteJob(@PathVariable int id) {
//        boolean remove = jobList.removeIf(job -> job.getId() == id);
//        return remove ? "Job removed Successfully..." : "Job not found!!";
//    }
//
//    //Update job by id
//    @PutMapping("/{id}")
//    public String updateJob(@PathVariable int id, @RequestBody Job updatedJob) {
//        for(Job job : jobList) {
//            if(job.getId() == id) {
//                job.setTitle(updatedJob.getTitle());
//                job.setCompany(updatedJob.getCompany());
//                job.setDescription(updatedJob.getDescription());
//                job.setLocation(updatedJob.getLocation());
//
//                return "Job updated successfully!";
//            }
//        }
//        return "Job not found!!";
//    }


    //Updated job repository after applying spring-data-jpa
    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        return jobService.getJobById(id);
    }

    @PostMapping
    public String createNewJob(@RequestBody Job job) {
        return jobService.createNewJob(job);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable int id) {
        return jobService.deleteJob(id);
    }

    @PutMapping("/{id}")
    public String updateJob(@PathVariable int id, @RequestBody Job updatedJob) {
        return jobService.updateJob(id, updatedJob);
    }
}
