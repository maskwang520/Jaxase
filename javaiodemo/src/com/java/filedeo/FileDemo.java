package com.java.filedeo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �ļ���������
 * 
 * @author maskwang
 *
 */
public class FileDemo {
	// ��ȡϵͳ���зָ���,�ļ��ָ���
	private String line = System.getProperty("line.separator");
	private String separator_Path = System.getProperty("file.separator");

	/**
	 * @throws IOException
	 *             ��⵱ǰĿ¼�Ƿ�����ļ����������򴴽�
	 */
	public static void createFile() throws IOException {

		File f = new File("e://test.txt");
		System.out.println(f);
		// public boolean exists() �ж��ļ��Ƿ����
		if (f.exists()) {
			System.out.println("File Exists");
		} else {
			System.out.println("File No Exists");
			// public boolean createNewFile() �������ļ�
			// f.mkdir(); //����·����������Ŀ¼
			// f.mkdirs(); //����·������Ŀ¼�����������༶Ŀ¼
			 f.createNewFile();
		}
	}
	 /**
     * ����ļ����һ���޸�ʱ��
     */
    public static void getTimeOfLastModified() {
        File f = new File("e://test.txt");

        //public long lastModified()    �ļ����һ�α��޸ĵ�ʱ��,UNIXʱ��
        long time = f.lastModified();
        System.out.println(time);

        Date d = new Date(time);
        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        System.out.println(sdf.format(d));
    }
    public static void operateFile() {

        File f = new File("e://test.txt");

        //public boolean canWrite()    �ļ��Ƿ��д
        System.out.println("canWrite: "+f.canWrite());

        //public long length()    �����ļ����ݳ��ȣ���λ�ֽ�
        System.out.println("length: "+f.length());

        //public String getPath()    �����ļ���·����Ϣ
        System.out.println("getPath: "+f.getPath());

        //public boolean isFile()    �жϸ�����·���Ƿ���һ���ļ�
        System.out.println("isFile: "+f.isFile());

        //public boolean isDirectory()    �жϸ�����·���Ƿ�ΪĿ¼
        System.out.println("isDirectory: "+f.isDirectory());

        //public String getName()    ���Ŀ¼������
        System.out.println("getName: "+f.getName());
        System.out.println("getPath: "+f.getPath());

        //public boolean renameTo(File dest)    �������ļ���·����ͬ���½�
        //f.renameTo(new File("c:\\test\\b.txt"));

        //public boolean delete()    ɾ���ļ����߿�Ŀ¼
//        f.delete();

    }

	public static void main(String[] args) throws IOException {
		//createFile();
		//getTimeOfLastModified();
		operateFile();
	}
}