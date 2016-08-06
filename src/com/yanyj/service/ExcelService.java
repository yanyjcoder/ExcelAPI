package com.yanyj.service;

/**
 * excelService接口
 * @author yanyj
 * @date 2016年8月5日
 */
public interface ExcelService {

	/**
	 * 表格是否存在
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	public boolean isExist(String excelFilePath);
	
	/**
	 * 创建特定版本的Excel文件
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @param fileName
	 * @param version
	 * @return
	 */
	public boolean createExcelFile(String filePath, String fileName, int version);
	
	/**
	 * 删除excel文件
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	public boolean deleteExcelFile(String filePath, String fileName);
	

}
