package com.sxt.io;

import java.io.File;

/*
 * �ļ�״̬
 * 1��������:exits
 * 2������
 *       �ļ���isFIle
 *       �ļ��У�isDirectory
 */
public class FileDemo04 {

	public static void main(String[] args) {
		File src = new File("IO_study01/ball01");
		System.out.println("�Ƿ���ڣ�"+src.exists());
		System.out.println("�Ƿ��ļ���"+src.isFile());
		System.out.println("�Ƿ��ļ���"+src.isDirectory());
		System.out.println("++++++++++++++++++++++++++++++");
		
		src = new File("IO.png");
		System.out.println("�Ƿ���ڣ�"+src.exists());
		System.out.println("�Ƿ��ļ���"+src.isFile());
		System.out.println("�Ƿ��ļ���"+src.isDirectory());
		
        src = new File ("C:\\Users\\A\\eclipse-workspace\\IO_study01\\ball1.png");
        		System.out.println("�Ƿ���ڣ�"+src.exists());
		System.out.println("�Ƿ��ļ���"+src.isFile());
		System.out.println("�Ƿ��ļ���"+src.isDirectory());
		
		
		//�ļ�״̬
		src= new File("xxx");
		if (null == src || !src.exists()) {
               System.out.println("�ļ�������");			
		}else {
			if (src.isFile()) {
				System.out.println("�ļ�����");
				
			}else{
		        System.out.println("�ļ��в���");
			}
		}
		
		
	}

}
