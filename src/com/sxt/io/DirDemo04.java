package com.sxt.io;

import java.io.File;

/*
 * �ݹ飺 �����Լ������Լ�
 * ��ӡ���ＶĿ¼���ļ�������
 * �ݹ��壺�ظ�����
 */
public class DirDemo04 {

	public static void main(String[] args) {
		File src = new File("C:\\Users\\A\\eclipse-workspace\\IO_study01");
		printName(src,0);
		
		}
        		
   //��ӡ���ＶĿ¼���ļ�������
	public static void printName(File src,int deep) {
		//����ǰ����
		for (int i = 0; i < deep; i++) {
			System.out.print("-");
		}
		//��ӡ����
		System.out.println(src.getName());
		if (null == src||!src.exists()) { //�ݹ�ͷ
			return;
		}else if (src.isDirectory()) { //Ŀ¼
			for (File s : src.listFiles()) { 
				
				printName(s,deep+1); //�ݹ���
			}
		}
	}
        

}
