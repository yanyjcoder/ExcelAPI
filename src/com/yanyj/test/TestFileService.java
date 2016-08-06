package com.yanyj.test;

import org.junit.Test;

import com.yanyj.service.FileService;
import com.yanyj.serviceImpl.FileServiceImpl;

public class TestFileService {

	@Test
	public void testCreateFile() {
		FileService fs = new FileServiceImpl();
		fs.createExcelFile("D:\\ÑÏÑå¾ý\\", "²âÊÔ2.xlsx");
	}
}
