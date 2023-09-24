package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Watcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(com.kodilla.patterns2.aop.calculator.Watcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void orderLog(){
        LOGGER.info("Order process has started");}
    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void UserLog(){
        LOGGER.info("Order process for Adam Smith");}


    @After("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void endOrderLog(){
        LOGGER.info("Order process has stopped");}


}

