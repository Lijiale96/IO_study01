package com.sxt.io;

import java.io.UnsupportedEncodingException;

/*
 * ���룺�ֽ�-->�ַ���
 * 
 * 
 */
public class ContentDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
	
  String msg = "��������ʹ��aa";
  
  //���룺�ֽ�����
  byte[] datas = msg.getBytes(); //Ĭ��ʹ�ù��̵��ַ���
//  System.out.println(datas.length);
  
//���룺�ַ��� String(byte[] bytes, int offset,int length, String charsetName)
	msg = new String(datas,0,datas.length,"GBK");
	System.out.println(msg);
	
	//���룺
	//1)�� �ֽ�������
	msg = new String(datas,0,datas.length-2,"utf8");
	System.out.println(msg);
	msg = new String(datas,0,datas.length-1,"utf8");
	System.out.println(msg);
	
	//2)���ַ�����ͳһ
	msg = new String(datas,0,datas.length-1,"gbk");
	System.out.println(msg);
	}
 
  
    
}