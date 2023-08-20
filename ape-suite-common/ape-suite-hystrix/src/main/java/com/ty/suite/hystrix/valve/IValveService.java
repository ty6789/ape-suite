package com.ty.suite.hystrix.valve;

import com.ty.suite.hystrix.annotation.DoHystrix;
import org.aspectj.lang.ProceedingJoinPoint;
import java.lang.reflect.Method;


public interface IValveService {

    Object access(ProceedingJoinPoint jp, Method method, DoHystrix doHystrix, Object[] args) throws Throwable;

}
