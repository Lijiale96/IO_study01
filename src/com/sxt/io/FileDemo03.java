package com.sxt.io;

import java.io.File;

/*
 * 名称或路径
 * 
 * getName()： 名称
 * getPath():相对路径 、绝对路径
 * getAbsolutePath() 绝对
 * getParent()：上路径，不存在返回空
 */



public class FileDemo03 {

	public static void main(String[] args) {
	
		File src = new File("C:\\Users\\A\\eclipse-workspace\\IO_study01\\ball1.png");
	   
		//基本信息
		System.out.println("名称"+src.getName());
		System.out.println("路径"+src.getPath());
		System.out.println("绝对路径"+src.getAbsolutePath());
	    System.out.println("父路径"+src.getParent());
	    System.out.println("父对象"+src.getParentFile().getAbsolutePath());
	}

}
