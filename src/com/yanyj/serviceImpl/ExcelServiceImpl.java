package com.yanyj.serviceImpl;

import org.apache.log4j.Logger;

import com.yanyj.constant.Constant;
import com.yanyj.service.ExcelService;
import com.yanyj.service.FileService;

/**
 * excelServiceʵ����
 * @author yanyj
 * @date 2016��8��5��
 */
public class ExcelServiceImpl implements ExcelService {
	
	private static final Logger log = Logger.getLogger("ExcelServiceImpl");

	private static final FileService fileService = new FileServiceImpl();

	/**
	 * ����Ƿ����
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath
	 * @return
	 */
	@Override
	public boolean isExist(String excelFilePath) {
		return fileService.isExsit(excelFilePath);
	}

	/**
	 * �����ض��汾��Excel�ļ�
	 * @author yanyj
	 * @date 2016��8��5��
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
			log.info("�����İ汾Ϊ2003");
		} else {
			fileName += Constant.SUFFIX_2007;
			log.info("�����İ汾Ϊ2007");
		}
		
		return fileService.createExcelFile(filePath, fileName);
	}
	
	/**
	 * ɾ��excel�ļ�
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath
	 * @return
	 */
	@Override
	public boolean deleteExcelFile(String filePath, String fileName) {
		log.info("����ɾ����Ϊ" + fileName + "���ļ�");
		if (fileService.deleteFile(filePath + fileName)) {
			log.info("ɾ���ɹ���");
			return true;
		}
		log.info("ɾ��ʧ�ܣ�");
		return false;
	}

}
