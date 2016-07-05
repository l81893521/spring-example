package com.babylove.www.spring.aopAndIoc.demo1.service;

import com.babylove.www.spring.aopAndIoc.demo1.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService{
	
	private InjectionDao injectionDao;
	
	public InjectionServiceImpl(){
		super();
	}
	
	/**
	 * 构造器注入
	 * @param injectionDao
	 */
	public InjectionServiceImpl(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}

	public void save(String args) {
		//模拟业务操作
		System.out.println("Service接收参数:" + args);
		args = args + ":" + args.hashCode();
		injectionDao.save(args);
	}
	
	/**
	 * 设值注入
	 * @param injectionDao
	 */
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}
}
