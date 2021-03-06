package com.java.filedeo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件常见操作
 * 
 * @author maskwang
 *
 */
public class FileDemo {
	// 获取系统的行分隔符,文件分隔符
	private String line = System.getProperty("line.separator");
	private String separator_Path = System.getProperty("file.separator");

	/**
	 * @throws IOException
	 *             检测当前目录是否存在文件，不存在则创建
	 */
	public static void createFile() throws IOException {

		File f = new File("e://test.txt");
		System.out.println(f);
		// public boolean exists() 判断文件是否存在
		if (f.exists()) {
			System.out.println("File Exists");
		} else {
			System.out.println("File No Exists");
			// public boolean createNewFile() 创建新文件
			// f.mkdir(); //根据路径创建单级目录
			// f.mkdirs(); //根据路径创建目录且允许创建多级目录
			 f.createNewFile();
		}
	}
	 /**
     * 获得文件最后一次修改时间
     */
    public static void getTimeOfLastModified() {
        File f = new File("e://test.txt");

        //public long lastModified()    文件最后一次被修改的时间,UNIX时间
        long time = f.lastModified();
        System.out.println(time);

        Date d = new Date(time);
        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        System.out.println(sdf.format(d));
    }
    public static void operateFile() {

        File f = new File("e://test.txt");

        //public boolean canWrite()    文件是否可写
        System.out.println("canWrite: "+f.canWrite());

        //public long length()    返回文件内容长度，单位字节
        System.out.println("length: "+f.length());

        //public String getPath()    返回文件的路径信息
        System.out.println("getPath: "+f.getPath());

        //public boolean isFile()    判断给定的路径是否是一个文件
        System.out.println("isFile: "+f.isFile());

        //public boolean isDirectory()    判断给定的路径是否为目录
        System.out.println("isDirectory: "+f.isDirectory());

        //public String getName()    获得目录的名字
        System.out.println("getName: "+f.getName());
        System.out.println("getPath: "+f.getPath());

        //public boolean renameTo(File dest)    重命名文件，路径不同会新建
        //f.renameTo(new File("c:\\test\\b.txt"));

        //public boolean delete()    删除文件或者空目录
//        f.delete();

    }

	public static void main(String[] args) throws IOException {
		//createFile();
		//getTimeOfLastModified();
		operateFile();
	}
}
