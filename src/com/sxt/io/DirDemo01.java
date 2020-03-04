package com.sxt.io;

import java.io.File;

/*
 * 创建目录
 * 1、mkdir():确保上级目录存在，不存在创建失败
 * 2、mkdirs（）：上级目录可以不存在，不存在一同来创建
 */
public class DirDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File dir = new File("C:/Users/A/eclipse-workspace/IO_study01/dir/test");
        //创建目录mkdirs()
        
        boolean flag = dir.mkdirs();
        System.out.println(flag);
        //创建目录mkdir（）
        dir = new File("C:/Users/A/eclipse-workspace/IO_study01/dir/test2");
        flag =dir.mkdirs();
        System.out.println(flag);
        
        
	}

}
