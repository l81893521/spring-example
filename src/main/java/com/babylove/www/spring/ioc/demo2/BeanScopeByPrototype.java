package com.babylove.www.spring.ioc.demo2;

public class BeanScopeByPrototype {
	
	public void say(){
		System.out.println(this.getClass().getSimpleName() + ":" + this.hashCode());
	}
}
