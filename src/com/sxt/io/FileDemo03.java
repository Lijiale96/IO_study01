package com.sxt.io;

import java.io.File;

/*
 * ���ƻ�·��
 * 
 * getName()�� ����
 * getPath():���·�� ������·��
 * getAbsolutePath() ����
 * getParent()����·���������ڷ��ؿ�
 */



public class FileDemo03 {

	public static void main(String[] args) {
	
		File src = new File("C:\\Users\\A\\eclipse-workspace\\IO_study01\\ball1.png");
	   
		//������Ϣ
		System.out.println("����"+src.getName());
		System.out.println("·��"+src.getPath());
		System.out.println("����·��"+src.getAbsolutePath());
	    System.out.println("��·��"+src.getParent());
	    System.out.println("������"+src.getParentFile().getAbsolutePath());
	}

}
