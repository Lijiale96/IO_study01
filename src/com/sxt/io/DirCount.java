package com.sxt.io;

import java.io.File;

/*
 * ʹ���������ͳ���ļ��еĴ�С
 */
public class DirCount {
   //��С
	private long len;
	//�ļ���·��
	private String path;
	//�ļ��ĸ���
	private int fileSize;//��������
	//�ļ��еĸ���
	private int dirSize;
	//Դ
	private File src;
	
    public DirCount(String path) {
	 			this.path =path;
	 			this.src = new File(path);
	 			count(this.src);
			}
	
	
	//ͳ�ƴ�С
	private void count(File src) {
		
	   	//��ȡ��С
			if (null!=src && src.exists()) {
				if (src.isFile()) { //��С
					len+=src.length();
					this.fileSize++;
					
				}else { //���Ｖ
					this.dirSize++;
					for (File s:src.listFiles()) {
						count(s);
					}
				}
			}
	}

	public long getLen() {
		return len;
	}
	
	
	
	public int getFileSize() {
		return fileSize;
	}


	public int getDirSize() {
		return dirSize;
	}




	public static void main(String[] args) {
		DirCount dir = new DirCount("C:\\Users\\A\\eclipse-workspace\\IO_study01");
	    System.out.println(dir.getLen()+"-->"+dir.getFileSize()+"-->"+dir.getDirSize());    
	    
	    DirCount dir2 = new DirCount("C:\\Users\\A\\eclipse-workspace\\IO_study01/src");
	    System.out.println(dir2.getLen()+"-->"+dir2.getFileSize()+"-->"+dir2.getDirSize()); 
		}
		
	
	
}
