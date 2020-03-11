/**   
 *
 */
package com.sunmengjie.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.DateFormatter;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class TestDate {

	/**
	 * 测试日期月初
	 */
	@Test
	public void TestgetDateByInitMonth() {
		Date date = new Date(20,03,11);
		
		Date dateByInitMonth = DateUtil.getDateByInitMonth(date);
		System.out.println(dateByInitMonth);
	}
	
	
	/**
	 * 测试日期月末
	 */
	@Test
	public void DateByFullMonthTest() {
		Date date = new Date(20,03,11);
		
		Date dateByInitMonth = DateUtil.getDateByFullMonth(date);
		System.out.println(dateByInitMonth);
	}
	
	/**
	 * 
	 */
	@Test
	public void TestDate() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		
		Date d1 = DateUtil.getDateByInitMonth(new Date());
		Date d2 = DateUtil.getDateByFullMonth(new Date());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String f1 = format.format(d1);
		String f2 = format.format(d2);
		System.out.println(f1);
		
		String replace = sql.replace("'{1}'", f1);
		String replace2 = replace.replace("{2}",f2);
		
		System.out.println(replace2);
	}
	
}
