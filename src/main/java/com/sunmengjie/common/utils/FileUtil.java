/**   
 *
 */
package com.sunmengjie.common.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Administrator
 *
 */
public class FileUtil {

	/**
	 * 返回文件夹的扩展名
	 * @param fileName
	 * @return
	 */
	public static String getExtendName(String fileName){
		
		int indexOf = fileName.lastIndexOf(".");
		if(indexOf<0) {
			return "";
		}
		
		return fileName.substring(indexOf);
		}
	
	/**
	 * 关闭流
	 */
	public static void closeAll(Closeable ... io){
		 for(Closeable temp: io) {
			   try {
			    if (null != temp)
			     temp.close();
			   } catch (IOException e) {
			    e.printStackTrace();
			   }
			}
		}
	/**
	 * 读取文件内容
	 * @param src
	 * @return
	 * @throws IOException 
	 */
	public static String readTextFile(InputStream src) throws IOException{
		
		// 创建输出流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(src));
		
		//定义缓冲对象
		StringBuffer sb = new StringBuffer();
		
		String read=null ;
		
		while ((read = br.readLine()) != null) {
			// 加入缓冲对象
			sb.append(read);
		}
		
		
		closeAll();
		
		
		return sb.toString();
		}
	
	/**
	 * 传入文本对象 ，获取文本内容
	 * @param txtFile
	 * @return
	 */
	public static String readTextFile(File txtFile){
		
		String readTextFile = readTextFile(txtFile);
		
		
		
		return readTextFile;
		
		
	}
	
	
	public static void main(String[] args) {
		String extendName = getExtendName("aa.jps");
		System.out.println(extendName);
	}
}
