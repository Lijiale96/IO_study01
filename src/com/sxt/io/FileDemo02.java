package com.sxt.io;

import java.io.File;

public class FileDemo02 {
	/*
	 * ����File����
	 * ���·�������·��
	 *1�������̷�:����·��
	 *2) �������̷������·��
	 */
	public static void main(String[] args) {
		
      String path ="C:\\Users\\A\\eclipse-workspace\\IO_study01\\ball1.png";
      
      //����·��
      File src = new File(path);
      System.out.println(src.getAbsolutePath());
      
      //���·��
      System.out.println(System.getProperty("user.dir"));
      src = new File("IO.png");
      System.out.println(src.getAbsolutePath());
      
      //����һ�������ڵ��ļ�
      src =new File("aaa/IO2.png");
      System.out.println(src.getAbsolutePath());
      
      
	}

}
