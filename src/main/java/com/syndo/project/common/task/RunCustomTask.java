package com.syndo.project.common.task;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 执行后续自定义任务
 * 
 * 需要异步执行加入@Async注解
 * @author ykc
 * @date 2021-5-24
 */
@Component("RunCustomTask")
public class RunCustomTask {

	private static Logger log = LoggerFactory.getLogger(RunCustomTask.class);

	public void runMultipleParams(String s, Boolean b, Long l, Double d, Integer i) {
		log.info("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i);
	}

	@Async
	public void runParams(String params) {
		log.info("执行有参方法：{}", params);
		try {
			Thread.sleep(5000);
			log.info("执行完了");
		} catch (InterruptedException e) {
			log.error("异常：{}", e.getMessage());
			Thread.currentThread().interrupt();
		}
	}

	@Async
	public void runParams(String params, Map<String, Object> map) {
		log.info("执行有参方法：{}：{}", params, map);
		try {
			Thread.sleep(5000);
			log.info("执行完了");
		} catch (InterruptedException e) {
			log.error("异常：{}", e.getMessage());
			Thread.currentThread().interrupt();
		}
	}

	@Async
	public void runNoParams(Map<String, Object> map) {
		log.info("执行无参方法");
	}

}
