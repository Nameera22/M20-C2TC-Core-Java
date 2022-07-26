package com.tns.core;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentDemo {

	public static void main(String[] args) {
		
		ReentrantLock l=new ReentrantLock();//object l
			
		l.lock();
		System.out.println(l.isLocked());//true
		l.unlock();
		//l.unlock();
			System.out.println(l.isHeldByCurrentThread());//false
			System.out.println(l.getHoldCount());
			System.out.println(l.getQueueLength())	;}

}
