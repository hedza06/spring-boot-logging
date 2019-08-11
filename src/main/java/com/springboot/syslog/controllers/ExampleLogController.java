package com.springboot.syslog.controllers;

import com.springboot.syslog.data.ExampleLog;
import com.springboot.syslog.services.ExampleLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/example-log")
public class ExampleLogController {

    @Autowired
    private ExampleLogService exampleLogService;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> logSomething(@RequestBody final ExampleLog exampleLog)
    {
        exampleLogService.createSomeLogData(exampleLog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> partialLogOfData(@PathVariable Long id)
    {
        exampleLogService.logOnlyIdentifier(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
