package com.sxt.io;

import java.io.File;

/*
 * 列出下一级
 * 1、list（）：列出下级名称
 * 2、listFiles（）：列出下级File对象
 * 
 * 列出所有的盘符：lists roots
 */
public class DirDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File dir = new File("C:/Users/A/eclipse-workspace/IO_study01");
        //创建下级名称
        String[] subNames = dir.list();
        for (String s : subNames) {
			System.out.println(s);
		}
       
        //下级对象listFiles（）
        File[] subFiles =dir.listFiles();
        for (File s : subFiles) {
			System.out.println(s.getAbsolutePath());
			
		}
        
        //所有盘符
        File[] roots =dir.listRoots();
        for (File r : roots) {
			System.out.println(r.getAbsolutePath());
		}
        		
        
        
	}

}
