package com.springboot.syslog.services;

import com.springboot.syslog.data.ExampleLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

@Service
@Description("Example log data service component")
public class ExampleLogService {

    private final Logger logger = LoggerFactory.getLogger(ExampleLogService.class);

    /**
     * Method for creating data log
     */
    public void createSomeLogData(ExampleLog exampleLog) {
        logger.info("Log data : {}", exampleLog);
    }

    /**
     * Method for logging only identifier
     * @param id given identifier from request
     */
    public void logOnlyIdentifier(Long id) {
        logger.info("Log identifier: {}", id);
    }
}
