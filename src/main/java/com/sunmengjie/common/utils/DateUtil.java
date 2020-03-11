/**   
 *
 */
package com.sunmengjie.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class DateUtil {

	/**
	 * 则返回的结果为某月的月初
	 * @param src
	 * @return
	 */
	public static Date getDateByInitMonth(Date src){
		//TODO 实现代码
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(new Date());
		
		calendar.set(Calendar.SECOND, 0); //设置0秒
		calendar.set(Calendar.MINUTE, 0); //设置0分
		calendar.set(Calendar.HOUR, 0);//设置0小时
		calendar.set(Calendar.AM_PM, Calendar.AM); //设置上午
		calendar.set(Calendar.DATE, 1);//设置1日
		
		
		return calendar.getTime();
	}
	
	/**
	 * 获取某月月末
	 * @param src
	 * @return
	 */
	public static Date getDateByFullMonth(Date src){
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.add(Calendar.MONTH, 1);
		
		calendar.set(Calendar.SECOND, 0); //设置0秒
		calendar.set(Calendar.MINUTE, 0); //设置0分
		calendar.set(Calendar.HOUR, 0);//设置0小时
		calendar.set(Calendar.AM_PM, Calendar.AM); //设置上午
		calendar.set(Calendar.DATE, 1);//设置1日
		
		calendar.set(Calendar.SECOND, -1);
		
		return calendar.getTime();
		//TODO 实现代码
		}
	
	
	public static void main(String[] args) {
		Date dateByInitMonth = getDateByFullMonth(new Date());
		System.out.println(dateByInitMonth);
	}
}
