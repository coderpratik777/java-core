package com.pratiti.training.selflearn;

import java.util.Map;
import java.util.Queue;

public class App {
	public static void main(String[] args) {
		Testing1 test=new Testing1();
		Testing2 test2=new Testing2();
		TokenQueueManager token=TokenQueueManager.getInstance();
		Map<Integer,Queue<Integer>> map=token.getMap();
		for(Map.Entry<Integer, Queue<Integer>> x:map.entrySet()) {
		    int key=x.getKey();
			if(key==1) {
				Queue<Integer> q=x.getValue();
				for(Integer y:q) {
					System.out.println(y);
				}
			}
		}
	}
}
