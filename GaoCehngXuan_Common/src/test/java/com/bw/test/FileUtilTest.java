package com.bw.test;

import org.junit.Test;

import com.bw.utils.FileUtil;

public class FileUtilTest {
	@Test
	public void fileName() {
		FileUtil fileUtil = new FileUtil();
		String userName = fileUtil.userName();
		System.out.println(userName);

	}
	@Test
	public void fileHome() {
		FileUtil fileUtil = new FileUtil();
		String fileHome = fileUtil.FileHome();
		System.out.println(fileHome);
		
	}
	@Test
	public void fileTemdir() {
		FileUtil fileUtil = new FileUtil();
		String fileTemdir = fileUtil.FileTemdir();
		System.out.println(fileTemdir);
		
	}
	

}
