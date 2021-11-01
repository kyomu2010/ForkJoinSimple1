package com.msmart.forkjoin;

import java.util.concurrent.ForkJoinPool;

import com.msmart.forkjoin.recursiveaction.SimpleRecursiveAction;

public class App {

	public static void main(String[] args) {
	
		// set fork join thread pool to match number of available processors 
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(20);
		//SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(120);
		pool.invoke(simpleRecursiveAction);
	}

}
