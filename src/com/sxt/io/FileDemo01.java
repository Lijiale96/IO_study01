package com.sxt.io;

import java.io.File;

public class FileDemo01 {

	public static void main(String[] args) {
		/*
		 * 构建File对象
		 */
      String path ="C:\\Users\\A\\eclipse-workspace\\IO_study01\\ball1.png";
      
      
      
      //1、构建File对象
      File src = new File(path);
      System.out.println(src.length());

	  
	//2、构建File对象
      src = new File("C:/Users/A/eclipse-workspace/IO_study01","ball1.png");
      src = new File("C:/Users/A/eclipse-workspace","IO_study01/ball1.png");
      System.out.println(src.length());
	 
      
     //3、构建File对象
      src = new File(new File("C:/Users/A/eclipse-workspace/IO_study01"),"ball1.png");
      
	}

}
