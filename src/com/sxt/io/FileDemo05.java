package com.sxt.io;

import java.io.File;

/*
 * ������Ϣ
 * length(�����ļ����ֽ���
 * 
 * 
 */
public class FileDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  File src= new File("C:\\Users\\A\\eclipse-workspace\\IO_study01\\ball1.png");
  System.out.println("���ȣ�"+src.length());
  
  src =new File("C:\\Users\\A\\eclipse-workspace\\IO_study01");
  System.out.println("���ȣ�"+src.length());
  
  src =new File("C:\\Users\\A\\eclipse-workspace\\IO_study02");
  System.out.println("���ȣ�"+src.length());
  
  
  
  
	}

}
