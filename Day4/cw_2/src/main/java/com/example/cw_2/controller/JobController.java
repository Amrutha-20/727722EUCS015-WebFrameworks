package com.example.cw_2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cw_2.model.Job;
import com.example.cw_2.services.JobService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class JobController {
    public JobService jobService;
    public JobController(JobService jobService)
    {
        this.jobService = jobService;
    }
    @PostMapping("/api/job")
    public boolean postMethodName(@RequestBody Job job) {
        return jobService.saveJob(job);
        
    }

    @GetMapping("/api/job")
    public List<Job> getMethodName() {
        List<Job> j =  jobService.getJobs();
        return j;
    }

    @GetMapping("/api/job/{jobId}")
    public Job jobId(@PathVariable("jobId") int id) {
        Job j = jobService.getJobById(id);
        return j;
    }
    
    
    
}
