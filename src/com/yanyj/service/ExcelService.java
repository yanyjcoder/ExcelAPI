package com.yanyj.service;

/**
 * excelService�ӿ�
 * @author yanyj
 * @date 2016��8��5��
 */
public interface ExcelService {

	/**
	 * ����Ƿ����
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath
	 * @return
	 */
	public boolean isExist(String excelFilePath);
	
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
	public boolean createExcelFile(String filePath, String fileName, int version);
	
	/**
	 * ɾ��excel�ļ�
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath
	 * @return
	 */
	public boolean deleteExcelFile(String filePath, String fileName);
	

}
