package com.sxt.io;

import java.io.File;

/*
 * ����Ŀ¼
 * 1��mkdir():ȷ���ϼ�Ŀ¼���ڣ������ڴ���ʧ��
 * 2��mkdirs�������ϼ�Ŀ¼���Բ����ڣ�������һͬ������
 */
public class DirDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File dir = new File("C:/Users/A/eclipse-workspace/IO_study01/dir/test");
        //����Ŀ¼mkdirs()
        
        boolean flag = dir.mkdirs();
        System.out.println(flag);
        //����Ŀ¼mkdir����
        dir = new File("C:/Users/A/eclipse-workspace/IO_study01/dir/test2");
        flag =dir.mkdirs();
        System.out.println(flag);
        
        
	}

}
