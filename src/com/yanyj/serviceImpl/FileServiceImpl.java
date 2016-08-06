package com.yanyj.serviceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.log4j.Logger;

import com.yanyj.service.FileService;

/**
 * 实现类
 * 
 * @author yanyj
 * @date 2016年8月5日
 */
public class FileServiceImpl implements FileService {

	private static final Logger log = Logger.getLogger("FileService.class");
	private File file = null;
	private static FileOutputStream fos = null;
	private static FileInputStream fis = null;

	/**
	 * 创建excel文件
	 * 
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 *            创建的路径
	 * @return
	 * @throws Exception 
	 */
	@Override
	public boolean createExcelFile(String filePath, String fileName) {

		file = new File(filePath + fileName);
		if (!file.getParentFile().exists()) {
			log.info("该文件目录不存在!正准备创建该目录......");
			if (!file.getParentFile().mkdirs()) {
				log.info("目录创建失败！");
				return false;
			}
			log.info("目录创建成功！正准备创建该文件.....");
		} else {
			if(file.exists()) {
				log.info("该文件已经存在！");
				return false;
			} 
		}
		
		try {
			fos = new FileOutputStream(filePath + fileName);
			log.info(fileName + "创建成功！");
		} catch (FileNotFoundException e) {
			log.info(fileName + "创建失败！");
			log.info(e.getMessage());
		}
		
		return false;
	}

	/**
	 * 获得文件输出流
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	@Override
	public FileOutputStream getOutputStream(String filePath) {
		try {
			if(fos == null) {
				fos = new FileOutputStream(filePath);
			}
		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
		}
		
		return fos;
	}
	
	/**
	 * 获得文件输入流
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	@Override
	public FileInputStream getInputStream(String filePath) {
		try {
			if(fis == null) {
				fis = new FileInputStream(filePath);
			}
		} catch (FileNotFoundException e) {
			log.info(e.getMessage());
		}
		return fis;
	}
	
	/**
	 * 判断文件是否存在
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	@Override
	public boolean isExsit(String filePath) {
		file = new File(filePath);
		return file.exists();
	}
	
	/**
	 * 删除该文件
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	@Override
	public boolean deleteFile(String filePath) {
		
		return new File(filePath).delete();
	}
}
