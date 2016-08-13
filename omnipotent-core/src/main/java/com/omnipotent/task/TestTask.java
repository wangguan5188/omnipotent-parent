package com.omnipotent.task;

import org.springframework.stereotype.Component;

/**
 * 测试定时任务调度器
 * 
 * @author zhangtb
 * @date 2016-8-3 15:44:00
 * @since 1.0.0
 */
@Component("testTask")
public class TestTask {
	
	/**
	 * 定时任务
	 */
	public void execute() {
		System.out.println("----------task start----------");
		
		System.out.println("定时任务开始执行...");
		
		System.out.println("----------task end----------");
	}

}
