package com.yanyj.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public interface FileService {
	
	/**
	 * 创建excel文件
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath 创建的路径
	 * @param fileName 创建的文件名
	 * @return
	 */
	public boolean createExcelFile(String filePath, String fileName);
	
	/**
	 * 获得输出流
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	public FileOutputStream getOutputStream(String filePath);
	
	/**
	 * 获得输入流
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	public FileInputStream getInputStream(String filePath);
	
	/**
	 * 判断文件是否存在
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	public boolean isExsit(String filePath);
	
	/**
	 * 删除该文件
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	public boolean deleteFile(String filePath);
}
