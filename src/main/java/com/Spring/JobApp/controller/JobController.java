package com.Spring.JobApp.controller;

import com.Spring.JobApp.model.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class JobController {

    private List<Job> jobList = new ArrayList<>();

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("job", new Job()); // modelAttribute must match form
        return "addJob";
    }

    @PostMapping("/submitJob")
    public String submitJob(@ModelAttribute("job") Job job, Model model) {
        job.setId(jobList.size() + 1);
        jobList.add(job);
        model.addAttribute("job", job);
        return "success";
    }

    @GetMapping("/view")
    public String viewJobs(Model model) {
        model.addAttribute("jobs", jobList);
        return "viewAllJob";
    }
}

