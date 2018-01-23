package com.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LogerServlet {

	Logger logger = Logger.getLogger(LogerServlet.class);

	public void before(JoinPoint jp) {
		logger.info("调用了" + jp.getTarget() + "方法："
				+ jp.getSignature().getName() + "参数为：" + jp.getArgs());
	}

	public void afterThrowing(JoinPoint jp, RuntimeException e) {
		logger.info("调用了"+jp.getSignature().getName()+"抛出了"+e.getMessage());
	}
}
