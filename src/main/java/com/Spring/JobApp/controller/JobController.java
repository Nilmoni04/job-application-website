package com.Spring.JobApp.controller;

import com.Spring.JobApp.model.Job;
import com.Spring.JobApp.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class JobController {

    @Autowired
    private JobRepository jobRepository; // Use DB

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("job", new Job());
        return "addJob";
    }

    @PostMapping("/submitJob")
    public String submitJob(@ModelAttribute("job") Job job, Model model) {
        Job savedJob = jobRepository.save(job); // Save to DB
        model.addAttribute("job", savedJob);
        return "success";
    }

    @GetMapping("/view")
    public String viewJobs(Model model) {
        model.addAttribute("jobs", jobRepository.findAll()); // Fetch from DB
        return "viewAllJob";
    }
}
