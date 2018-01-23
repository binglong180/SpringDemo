package com.spring.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class LogerServlet {

	Logger logger = Logger.getLogger(LogerServlet.class);

	public void before(JoinPoint jp) {
		logger.info("调用了" + jp.getTarget() + "方法："
				+ jp.getSignature().getName() + "参数为：" + jp.getArgs());
	}

	public void afterReturning(JoinPoint jp, Object result) {
		logger.info("调用了" + jp.getTarget() + ",方法："
				+ jp.getSignature().getName() + ",返回值为：" + result);
	}
}
