package com.yanyj.test;

import org.junit.Test;

import com.yanyj.service.ExcelService;
import com.yanyj.serviceImpl.ExcelServiceImpl;

public class TestExcelService {

	@Test
	public void testExcelService() {
		ExcelService es = new ExcelServiceImpl();
		//es.createExcelFile("D:\\ÑÏÑå¾ý\\", "test2007", 2007);
		es.deleteExcelFile("D:\\ÑÏÑå¾ý\\", "test2007.xlsx");
	}
}
