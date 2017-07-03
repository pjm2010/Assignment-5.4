package com.myPack;

public class FixedStack implements Stack{

	int sizeOfConstructor=0;
	FixedStack(int x){
		
		sizeOfConstructor=x;
		
	}
	
	@Override
	public void push(int i) {
		// TODO Auto-generated method stub
		if(sizeOfConstructor<i){
			System.out.println("Stack overFlow");
		}
		else{
			System.out.println("Stack not overFLowed yet");
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}

}
