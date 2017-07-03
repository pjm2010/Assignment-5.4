package com.myPack;

public class VariableStack implements Stack {
	
	
	int sizeOfConstructor=0;
	VariableStack(int x){
	
		sizeOfConstructor=x;
	}
	
	@Override
	public void push(int i) {
		// TODO Auto-generated method stub
			if(i>sizeOfConstructor){
				
				sizeOfConstructor=sizeOfConstructor+(i-sizeOfConstructor);
				System.out.println("The new Construnctor size has "+sizeOfConstructor);
			} 	
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
			
		return 0;
	}

}
