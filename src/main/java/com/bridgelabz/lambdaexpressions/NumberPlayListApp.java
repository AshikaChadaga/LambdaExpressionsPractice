package com.bridgelabz.lambdaexpressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class NumberPlayListApp {
	
	public static void main(String[] args) {
		
		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int index=0 ; index<5 ; index++)
			myNumberList.add(index);
		
		//Method 1 : Traversing  using Iterator
		Iterator<Integer> iterator = myNumberList.iterator();
		while(iterator.hasNext()) {
			Integer eachInteger = iterator.next();
			System.out.println("Iterator Value: "+eachInteger);
		}
		
		
		//Method 2 : Traversing with Consumer interface 
		class MyConsumer implements Consumer<Integer>{
			public void accept(Integer t) {
				System.out.println("Method2 : Consumer Impl Value: "+t);
			}
		}
		MyConsumer action = new MyConsumer();
		myNumberList.forEach(action);
		
		
		//Method 3 : Traversing with Anonymous Consumer interface 
		myNumberList.forEach(new Consumer<Integer>(){
			public void accept(Integer t) {
				System.out.println("Method3 : forEach anonymous Impl Value: "+t);
			}
		});
		
		
		//Method 4: Explicit Lambda Function
		Consumer<Integer> myListAction = n -> {
			System.out.println("Method4 : forEach Explicit Lambda Impl Value: "+n);
		};
		myNumberList.forEach(myListAction);
		
		
		//Method 5: Implicit Lambda Function
		myNumberList.forEach(n ->{
			System.out.println("Method5 : forEach Implicit Lambda Impl Value: "+n);
		});
	}
}
