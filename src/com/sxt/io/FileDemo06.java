package com.sxt.io;

import java.io.File;
import java.io.IOException;

/*
 * ������Ϣ
 * createNewFile():�����ڲŴ��������ڴ����ɹ�
 * delete(): ɾ���Ѿ����ڵ��ļ�
 * 
 * 
 */
public class FileDemo06 {

	public static void main(String[] args) throws IOException {
		
     File src= new File("C:\\Users\\A\\eclipse-workspace\\IO_study01\\ball1.txt");
     boolean flag = src.createNewFile();
     System.out.println(flag);
     flag= src.delete();
     System.out.println(flag);
     
     System.out.println("---------------");
     //�����ļ���
     src= new File("C:\\Users\\A\\eclipse-workspace\\IO_study02");
     flag = src.createNewFile();
     System.out.println(flag);
     flag=src.delete();
     System.out.println(flag);
     
     
     //���䣺con com3   ����ϵͳ���豸�� ��������ȷ����
     
     src =new File("C:\\Users\\A\\eclipse-workspace\\IO_study01\\con");
     src.createNewFile();

	
	}

}
