package com.sxt.io;

import java.io.File;

public class FileDemo01 {

	public static void main(String[] args) {
		/*
		 * ����File����
		 */
      String path ="C:\\Users\\A\\eclipse-workspace\\IO_study01\\ball1.png";
      
      
      
      //1������File����
      File src = new File(path);
      System.out.println(src.length());

	  
	//2������File����
      src = new File("C:/Users/A/eclipse-workspace/IO_study01","ball1.png");
      src = new File("C:/Users/A/eclipse-workspace","IO_study01/ball1.png");
      System.out.println(src.length());
	 
      
     //3������File����
      src = new File(new File("C:/Users/A/eclipse-workspace/IO_study01"),"ball1.png");
      
	}

}
