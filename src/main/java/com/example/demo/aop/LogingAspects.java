package com.example.demo.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogingAspects {
	private static final Logger logger = LoggerFactory.getLogger(LogingAspects.class);

	@Before("within(com.example.demo.controller.UserController)")
	public void controllerStartLog(JoinPoint joinPoint) {
		String str = joinPoint.toString();
		String args = Arrays.toString(joinPoint.getArgs());
		logger.info("Start {},args {}", str, args);
	}

	@AfterReturning("within(com.example.demo.controller.UserController)")
	public void controllerEndLog(JoinPoint joinPoint) {
		String str = joinPoint.toString();
		String args = Arrays.toString(joinPoint.getArgs());
		logger.info("End {},args {}", str, args);
	}
}
