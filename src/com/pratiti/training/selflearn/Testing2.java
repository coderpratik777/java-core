
package com.pratiti.training.selflearn;

public class Testing2 {
	TokenQueueManager tokenqueue=TokenQueueManager.getInstance();
	public Testing2() {
		// TODO Auto-generated constructor stub
		tokenqueue.enqueue(23, 2);
		tokenqueue.enqueue(24, 2);
	}

}
