package com.bw.utils;

public class FileUtil {
	//获取用户姓名
	public String userName() {
		String userName = System.getProperties().getProperty("user.name");
		return userName;
	}
		
	//获取用户路径
		public String FileHome() {
			String userHome = System.getProperties().getProperty("user.home");
			return userHome;
		}
			
		//返回操作系统临时目录
		public String FileTemdir() {
			String userTemdir = System.getProperties().getProperty("user.io.temdir");
			return userTemdir;
		}
			

}
