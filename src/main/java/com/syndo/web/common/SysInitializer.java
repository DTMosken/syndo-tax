package com.syndo.web.common;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 系统初始化
 *
 * @author ykc
 */
@Component
public class SysInitializer implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("-----系统初始化---------");

	}
}
