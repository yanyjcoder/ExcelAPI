package com.yanyj.serviceImpl;

import org.apache.log4j.Logger;

import com.yanyj.constant.Constant;
import com.yanyj.service.ExcelService;
import com.yanyj.service.FileService;

/**
 * excelService实现类
 * @author yanyj
 * @date 2016年8月5日
 */
public class ExcelServiceImpl implements ExcelService {
	
	private static final Logger log = Logger.getLogger("ExcelServiceImpl");

	private static final FileService fileService = new FileServiceImpl();

	/**
	 * 表格是否存在
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	@Override
	public boolean isExist(String excelFilePath) {
		return fileService.isExsit(excelFilePath);
	}

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
	@Override
	public boolean createExcelFile(String filePath, String fileName, int version) {
		
		if (version == Constant.VERSION_2003) {
			fileName += Constant.SUFFIX_2003;
			log.info("创建的版本为2003");
		} else {
			fileName += Constant.SUFFIX_2007;
			log.info("创建的版本为2007");
		}
		
		return fileService.createExcelFile(filePath, fileName);
	}
	
	/**
	 * 删除excel文件
	 * @author yanyj
	 * @date 2016年8月5日
	 * @description
	 * @param filePath
	 * @return
	 */
	@Override
	public boolean deleteExcelFile(String filePath, String fileName) {
		log.info("正在删除名为" + fileName + "的文件");
		if (fileService.deleteFile(filePath + fileName)) {
			log.info("删除成功！");
			return true;
		}
		log.info("删除失败！");
		return false;
	}

}
