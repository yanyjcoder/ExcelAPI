package com.yanyj.serviceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.log4j.Logger;

import com.yanyj.service.FileService;

/**
 * ʵ����
 * 
 * @author yanyj
 * @date 2016��8��5��
 */
public class FileServiceImpl implements FileService {

	private static final Logger log = Logger.getLogger("FileService.class");
	private File file = null;
	private static FileOutputStream fos = null;
	private static FileInputStream fis = null;

	/**
	 * ����excel�ļ�
	 * 
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath
	 *            ������·��
	 * @return
	 * @throws Exception 
	 */
	@Override
	public boolean createExcelFile(String filePath, String fileName) {

		file = new File(filePath + fileName);
		if (!file.getParentFile().exists()) {
			log.info("���ļ�Ŀ¼������!��׼��������Ŀ¼......");
			if (!file.getParentFile().mkdirs()) {
				log.info("Ŀ¼����ʧ�ܣ�");
				return false;
			}
			log.info("Ŀ¼�����ɹ�����׼���������ļ�.....");
		} else {
			if(file.exists()) {
				log.info("���ļ��Ѿ����ڣ�");
				return false;
			} 
		}
		
		try {
			fos = new FileOutputStream(filePath + fileName);
			log.info(fileName + "�����ɹ���");
		} catch (FileNotFoundException e) {
			log.info(fileName + "����ʧ�ܣ�");
			log.info(e.getMessage());
		}
		
		return false;
	}

	/**
	 * ����ļ������
	 * @author yanyj
	 * @date 2016��8��5��
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
	 * ����ļ�������
	 * @author yanyj
	 * @date 2016��8��5��
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
	 * �ж��ļ��Ƿ����
	 * @author yanyj
	 * @date 2016��8��5��
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
	 * ɾ�����ļ�
	 * @author yanyj
	 * @date 2016��8��5��
	 * @description
	 * @param filePath
	 * @return
	 */
	@Override
	public boolean deleteFile(String filePath) {
		
		return new File(filePath).delete();
	}
}
