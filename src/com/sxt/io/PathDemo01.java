package com.sxt.io;

import java.io.File;

public class PathDemo01 {

	public static void main(String[] args) {
	/*
	 * ���Ʒָ��� separator
	 */
    String path="C:\\Users\\A\\eclipse-workspace\\IO_study01\\ball1.png";
    System.out.println(File.separatorChar);
    
    //����
    //1����
    path="C:/Users/A/eclipse-workspace/IO_study01/ball1.png";
    System.out.println(path);
    
    //2��
    path = "C:"+File.separator+"Users"+File.separator+"A"+File.separator+"eclipse-workspace"
+File.separator+ "IO_study01"  +File.separator+ "ball1.png";
    
    System.out.println(path);
	}

}
