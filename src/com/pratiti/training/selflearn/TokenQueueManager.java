package com.pratiti.training.selflearn;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class TokenQueueManager {
	private static TokenQueueManager instance = null;
    private Map<Integer, Queue<Integer>> counterQueues = new HashMap<>();

    private TokenQueueManager() {
        // Private constructor to prevent instantiation from outside
    }

    public static synchronized TokenQueueManager getInstance() {
        if (instance == null) {
            instance = new TokenQueueManager();
        }
        return instance;
    }

    public synchronized void enqueue(Integer num, int counter) {
        Queue<Integer> counterQueue = counterQueues.get(counter);
        if (counterQueue == null) {
            counterQueue = new LinkedList<>();
            counterQueues.put(counter, counterQueue);
        }
        counterQueue.add(num);
    }

    public synchronized Integer dequeue(int counter) {
        Queue<Integer> counterQueue = counterQueues.get(counter);
        if (counterQueue == null || counterQueue.isEmpty()) {
            return null;
        }
        return counterQueue.poll();
    }
    
 
    public synchronized boolean isEmpty(int counter) {
        Queue<Integer> counterQueue = counterQueues.get(counter);
        return (counterQueue == null || counterQueue.isEmpty());
    }
    
    public Map<Integer,Queue<Integer>> getMap(){
    	return counterQueues;
    }

}
