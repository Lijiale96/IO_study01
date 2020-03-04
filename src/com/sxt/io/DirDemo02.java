package com.sxt.io;

import java.io.File;

/*
 * �г���һ��
 * 1��list�������г��¼�����
 * 2��listFiles�������г��¼�File����
 * 
 * �г����е��̷���lists roots
 */
public class DirDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File dir = new File("C:/Users/A/eclipse-workspace/IO_study01");
        //�����¼�����
        String[] subNames = dir.list();
        for (String s : subNames) {
			System.out.println(s);
		}
       
        //�¼�����listFiles����
        File[] subFiles =dir.listFiles();
        for (File s : subFiles) {
			System.out.println(s.getAbsolutePath());
			
		}
        
        //�����̷�
        File[] roots =dir.listRoots();
        for (File r : roots) {
			System.out.println(r.getAbsolutePath());
		}
        		
        
        
	}

}
