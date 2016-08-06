package com.yanyj.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public interface FileService {
	
	/**
	 * ����excel�ļ�
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath ������·��
	 * @param fileName �������ļ���
	 * @return
	 */
	public boolean createExcelFile(String filePath, String fileName);
	
	/**
	 * ��������
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath
	 * @return
	 */
	public FileOutputStream getOutputStream(String filePath);
	
	/**
	 * ���������
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath
	 * @return
	 */
	public FileInputStream getInputStream(String filePath);
	
	/**
	 * �ж��ļ��Ƿ����
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath
	 * @return
	 */
	public boolean isExsit(String filePath);
	
	/**
	 * ɾ�����ļ�
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath
	 * @return
	 */
	public boolean deleteFile(String filePath);
}
