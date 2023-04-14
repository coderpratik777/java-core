package com.pratiti.training.selflearn;

public class Testing1 {
	
	TokenQueueManager tokenqueue=TokenQueueManager.getInstance();
	public Testing1() {
		// TODO Auto-generated constructor stub
		tokenqueue.enqueue(23, 1);
		tokenqueue.enqueue(24, 1);
		tokenqueue.enqueue(34, 1);
	}
}
