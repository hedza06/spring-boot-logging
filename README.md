# Spring Boot Logging Configuration

This project demonstrates usage of logback configuration. There is three levels
of configuration:
- Standard STDOUT (Console logger)
- SYSLOG (Logging to system log)
- RollingFile (configuration of creating log files)

This is very useful especially for enterprise apps that needs audit mechanism (all user and system actions logged). 

One of the SoC (Security of Compliance) rules is that vendor is not allowed to see
user/system logs so it's even better to transfer all logs to remote location on system 
log immediately after log generation.

## Syslog facilities
![alt text](https://github.com/hedza06/spring-boot-logging/blob/master/src/main/resources/facilities.png)

## Contribution
If someone is interesting in contribution please contact me on e-mail ```hedzaprog@gmail.com```. There will be more interesting things to come for Spring Boot especially.

## Author
Heril Muratović   
Software Engineer  
<br>
**Mobile**: +38269657962  
**E-mail**: hedzaprog@gmail.com  
**Skype**: hedza06  
**Twitter**: hedzakirk  
**LinkedIn**: https://www.linkedin.com/in/heril-muratovi%C4%87-021097132/  
**StackOverflow**: https://stackoverflow.com/users/4078505/heril-muratovic

