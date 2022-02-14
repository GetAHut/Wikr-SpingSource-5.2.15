package com.wikr.event;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @Author: xyt
 * @Date: 2022/2/14 12:20
 * @version: 1.0.0
 */
@Component
public class WikrLifecycle implements SmartLifecycle {
	@Override
	public void start() {
		System.out.println("容器启动完成");
	}

	@Override
	public void stop() {
		// Meta- 这个方法 只有在 isRunning = true的实现才会调用
		System.out.println("容器关闭");
	}

	@Override
	public boolean isRunning() {
		return false;
	}
}
