package com.galaxyinternet.framework.core.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
/**
 * 日期处理工具
 */
public class DateUtil {
	public static final TimeZone GTM8TimeZone = TimeZone.getTimeZone("GMT+8");
	private static final String dateFormat = "yyyy-MM-dd";
	private static final String dateTimeFormat = "MM/dd/yyyy HH:mm:ss";
	private static final String dateTimeFormatForChina = "yyyy-MM-dd HH:mm:ss";
	private static final String dateFormatForTeamCode = "yyyyMMdd";
    /**
     * 把毫秒转化成日期
     * @param dateFormat(日期格式，例如：MM/ dd/yyyy HH:mm:ss)
     * @param millSec(毫秒数)
     * @return
     */
    public static  String transferLongToDate(String dateFormat,Long millSec){
     SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
      Date date= new Date(millSec);
            return sdf.format(date);
    }

	public static Date convertStringToDate(String time) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setTimeZone(GTM8TimeZone);
		return sdf.parse(time);
	}
	
	public static Date convertStringtoD(String time)throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(dateTimeFormatForChina);
		sdf.setTimeZone(GTM8TimeZone);
		return sdf.parse(time);
	}
	

	public static String refFormatNowDate() {
		Date nowTime = new Date(System.currentTimeMillis());
		SimpleDateFormat sdFormatter = new SimpleDateFormat(dateFormat);
		String retStrFormatNowDate = sdFormatter.format(nowTime);
		return retStrFormatNowDate;
	}
	
	public static String longToString(long time){
		Date nowTime = new Date(time);
		SimpleDateFormat sdFormatter = new SimpleDateFormat(dateFormat);
		String retStrFormatNowDate = sdFormatter.format(nowTime);
		return retStrFormatNowDate;
	}
	
	public static String longToString(long time, String format){
		Date nowTime = new Date(time);
		SimpleDateFormat sdFormatter = new SimpleDateFormat(format);
		String retStrFormatNowDate = sdFormatter.format(nowTime);
		return retStrFormatNowDate;
	}
	
	public static String longString(long time){
		Date nowTime = new Date(time);
		SimpleDateFormat sdFormatter = new SimpleDateFormat(dateTimeFormatForChina);
		String retStrFormatNowDate = sdFormatter.format(nowTime);
		return retStrFormatNowDate;
	}

	public static Date convertStringToDate(String time, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(GTM8TimeZone);
		return sdf.parse(time);
	}

	public static Date convertStringToDateTime(String time) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(dateTimeFormat);
		sdf.setTimeZone(GTM8TimeZone);
		return sdf.parse(time);
	}

	public static Date convertStringToDateTimeForChina(String time) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(dateTimeFormatForChina);
		sdf.setTimeZone(GTM8TimeZone);
		return sdf.parse(time);
	}

	public static String convertDateToStringForChina(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateTimeFormatForChina);
		sdf.setTimeZone(GTM8TimeZone);
		return sdf.format(date);
	}

	public static String convertDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		sdf.setTimeZone(GTM8TimeZone);
		return sdf.format(date);
	}

	public static String convertDateToStringForTeamCode(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormatForTeamCode);
		sdf.setTimeZone(GTM8TimeZone);
		return sdf.format(date);
	}

	public static Date getSearchMonthFromDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(GTM8TimeZone);
		calendar.setTime(date);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date getSearchMonthToDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(GTM8TimeZone);
		calendar.setTime(date);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date getSearchYearFromDate(int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(GTM8TimeZone);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date getSearchYearToDate(int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(GTM8TimeZone);
		calendar.set(Calendar.YEAR, year + 1);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DATE, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static String convertDateToString(Date date, String partten) {
		SimpleDateFormat sdf = new SimpleDateFormat(partten);
		sdf.setTimeZone(GTM8TimeZone);
		return sdf.format(date);
	}

	public static Date getSearchFromDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(GTM8TimeZone);
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date getSearchToDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(GTM8TimeZone);
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static Date makeDayByHourAndMinute(int hour, int minute) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		return calendar.getTime();
	}

	public static int getHourByDate(Date date) {
		if (date == null) {
			return 0;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	public static int getMinuteByDate(Date date) {
		if (date == null) {
			return 0;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * 得到当前日期，只保留年、月、日的信息
	 * 
	 * @return
	 */
	public static Date getCurrentDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(GTM8TimeZone);
		calendar.setTimeInMillis(System.currentTimeMillis());
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	public static String getMessageID() {
		String msgID = null;
		try {
			Date now = new Date();
			// String userid = App.getApp().getmAppData().getUser().mID + "";
			String userid = "";
			Random ran = new Random(System.currentTimeMillis());
			msgID = userid + now + ran.nextLong();
			msgID = Md5Utils.getMD5Str(msgID);
		} catch (Exception e) {

		}
		return msgID;
	}
	/**获取指定时间多少天以后的日期
	 * @param date
	 * @param day
	 * @return
	 */
	public static Date addDate(Date date, int day) {
		Calendar calendar = null;
		calendar = Calendar.getInstance();
		long millis = getMillis(date) + ((long) day) * 24 * 3600 * 1000;
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
	/**获取指定时间的毫秒值
	 * @param date
	 * @return
	 */
	public static long getMillis(Date date) {
		Calendar calendar = null;
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getTimeInMillis();
	}
	/**
	 * 获取两个时间串时间的差值，单位为小时
	 * 
	 * @param startTime
	 *            开始时间 yyyy-MM-dd HH:mm:ss
	 * @param endTime
	 *            结束时间 yyyy-MM-dd HH:mm:ss
	 * @return 两个时间的差值(秒)
	 */
	public static int getDiffHour(String startTime, String endTime) {
		long diff = 0;
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date startDate = ft.parse(startTime);
			Date endDate = ft.parse(endTime);
			diff = startDate.getTime() - endDate.getTime();
			diff = diff / (1000 * 60 * 60);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Long(diff).intValue();
	}
	/**
	 * 返回当前指定的时间戳。格式为yyyy-MM-dd HH:mm:ss
	 * 
	 * @return 格式为yyyy-MM-dd HH:mm:ss，总共19位。
	 */
	public static String getCurrentDateTime() {
		return getFormatDateTime(new Date(), "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 根据给定的格式与时间(Date类型的)，返回时间字符串。最为通用。<br>
	 * 
	 * @param date
	 *            指定的日期
	 * @param format
	 *            日期格式字符串
	 * @return String 指定格式的日期字符串.
	 */
	public static String getFormatDateTime(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}
	/**
	 * 格式化日期显示格式
	 * 
	 * @param sdate
	 *            原始日期格式 s - 表示 "yyyy-mm-dd" 形式的日期的 String 对象
	 * @param format
	 *            格式化后日期格式
	 * @return 格式化后的日期显示
	 */
	public static String dateFormat(String sdate, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		java.sql.Date date = java.sql.Date.valueOf(sdate);
		String dateString = formatter.format(date);
		return dateString;
	}
	/**
	 * 返回给定时间字符串。
	 * <p>
	 * 格式：yyyy-MM-dd
	 * 
	 * @param date
	 *            日期
	 * @return String 指定格式的日期字符串.
	 */
	public static String getFormatDate(Date date) {
		return getFormatDateTime(date, dateTimeFormatForChina);
	}
	
	
	
	
	
	// string类型转换为date类型
	// strTime要转换的string类型的时间，formatType要转换的格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日
	// HH时mm分ss秒，
	// strTime的时间格式必须要与formatType的时间格式相同
	public static Date stringToDate(String strTime, String formatType) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(formatType);
		Date date = null;
		date = formatter.parse(strTime);
		return date;
	}

	// date类型转换为long类型
	// date要转换的date类型的时间
	public static long dateToLong(Date date) {
		return date.getTime();
	}

	// string类型转换为long类型
	// strTime要转换的String类型的时间
	// formatType时间格式
	// strTime的时间格式和formatType的时间格式必须相同
	public static long stringToLong(String strTime, String formatType) throws ParseException {
		Date date = stringToDate(strTime, formatType); // String类型转成date类型
		if (date == null) {
			return 0;
		} else {
			long currentTime = dateToLong(date); // date类型转成long类型
			return currentTime;
		}
	}
	
	
	
	/**
	 * type = 1 ;  当年第一天
	 * type ＝ 2;  当月第一天
	 * type = 3 ; 当季度第一天
	 * type = 4 ; 本周第一天
	 * @return
	 */
	public static String getDefaultSdate(Integer type){
		String rsdate = null;
		if(type==1){
			rsdate = DateUtil.getFormatDateTime(new Date(),"yyyy-01-01");
		}else if(type==2){
			rsdate = DateUtil.getFormatDateTime(DateUtil.getCurrentDate(),"yyyy-mm-01");
		}else if(type==3){
		}else if(type==4){
		}else {
		}
		return rsdate;
	}
	
	
	/**
	 * 获取结束时间
	 * type = 1 ;  当天
	 * type ＝ 2　; 当月最后一天
	 * type = 3 ;  当季度最后一天
	 * type = 4 ;  本周最后一天
	 * @return
	 */
	public static String getDefaultEdate(Integer type){
		String redate = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		Calendar ca = Calendar.getInstance(); 
		if(type==1){
			redate = DateUtil.getFormatDateTime(new Date(),"yyyy-MM-dd");
		}else if(type==2){
			ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
			redate = format.format(ca.getTime());
		}else if(type==3){
		}else if(type==4){
		}else {
		}
		return redate;
	}
	
	/**
	 * 根据年 月 获取对应的月份 天数
	 * */
	public static int getDaysByYearMonth(int year, int month) {

		Calendar a = Calendar.getInstance();
		a.set(Calendar.YEAR, year);
		a.set(Calendar.MONTH, month - 1);
		a.set(Calendar.DATE, 1);
		a.roll(Calendar.DATE, -1);
		int maxDate = a.get(Calendar.DATE);
		return maxDate;
	}
	
	/**
	 * 获取当前年份
	 * @return
	 */
	public static int getCurrentYear(){
		//获取年份
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}
	
	
	
	/**
	 * 获取当前年份第一天
	 * @return
	 */
	public static Date getCurrYearFirst() {
		int currentYear = getCurrentYear();
		return getYearFirst(currentYear);
	}

	/**
	 * 获取指定年份第一天
	 * @param year
	 * @return
	 */
	public static Date getYearFirst(int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		Date currYearFirst = calendar.getTime();
		return currYearFirst;
	}
	
	
	
	
	/**
	 * 根据传入的     年 月 日， 获取 开始、结束 时间 
	 * @param year month day
	 * @return resultMap：beginTimeStr、endTimeStr
	 */
	public static Map<String,String> getBeginEndTimeStr(Integer year, Integer month, Integer day){
		Map<String,String> resultMap = new HashMap<String,String>();
		String beginTimeStr = null;
		String endTimeStr = null;
		
		Date bdate = null;
		Date edate = null;
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(GTM8TimeZone);
		
		if(day!=null && month!=null && year!=null){
			calendar.clear();
			
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month-1);
			calendar.set(Calendar.DATE, day);
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);
			
			bdate = calendar.getTime();
			
			calendar.set(Calendar.HOUR_OF_DAY, 23);
			calendar.set(Calendar.MINUTE, 59);
			calendar.set(Calendar.SECOND, 59);
			calendar.set(Calendar.MILLISECOND, 0);
			
			edate = calendar.getTime();
		}else if(day==null && month!=null && year!=null){
			calendar.clear();
			
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month-1);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);
			
			bdate = calendar.getTime();
			
			calendar.set(Calendar.DAY_OF_MONTH,  calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
			
			calendar.set(Calendar.HOUR_OF_DAY, 23);
			calendar.set(Calendar.MINUTE, 59);
			calendar.set(Calendar.SECOND, 59);
			calendar.set(Calendar.MILLISECOND, 0);
			
			edate = calendar.getTime();
		}else if(day==null && month==null && year!=null){
			calendar.clear();
			
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.DAY_OF_YEAR, 1);
			calendar.set(Calendar.HOUR_OF_DAY, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);
			
			bdate = calendar.getTime();
			
			calendar.set(Calendar.DAY_OF_YEAR, calendar.getActualMaximum(Calendar.DAY_OF_YEAR));
			calendar.set(Calendar.HOUR_OF_DAY, 23);
			calendar.set(Calendar.MINUTE, 59);
			calendar.set(Calendar.SECOND, 59);
			calendar.set(Calendar.MILLISECOND, 0);
			
			edate = calendar.getTime();
		}else{
			return null;
		}
		
		beginTimeStr = convertDateToStringForChina(bdate);
		endTimeStr = convertDateToStringForChina(edate);
		
		resultMap.put("beginTimeStr", beginTimeStr);
		resultMap.put("endTimeStr", endTimeStr);
		
		return resultMap;
	}
	
	
	
	/**
	 * 根据传入的     年 月 日  时分 秒 等到long
	 */
	public static Long convertHMSToDateTime(int year, int month, int day, int hh, int mm, int ss){
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(GTM8TimeZone);
		calendar.clear();
		
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.DATE, day);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
			
		//	bdate = calendar.getTime();
		Date date = calendar.getTime();
		Long _1 = date.getTime();
		Long _2 = calendar.getTimeInMillis();
		
		return calendar.getTimeInMillis();
	}
	
	

	
	
	
	/**
	 * 根据传入的  timeStr,
	 * 返回  今日、明日、  
	 */
	public static String convertTimeForSuchDay(String beginTimeStr){
		
		long aday = (long) 1*24*60*60*1000;
		
		String[] date_time = beginTimeStr.split(" ");
		String date = date_time[0];
		String time = "";
		if(date_time.length == 2){
			time = date_time[1];
		}
		
		
		Date beginTimeDate = null;
		try {
			beginTimeDate = convertStringToDate(date,"yyyy-MM-dd");
		} catch (ParseException e) {
			e.printStackTrace();
			return "（" + beginTimeStr +"）" ;
		}
		Long beginTimeLong = beginTimeDate.getTime();
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		long nowTimeLong = calendar.getTimeInMillis();
		
		
		if(nowTimeLong + aday == beginTimeLong){
			beginTimeStr = "明日（" + date +"） " + time ;
		}else if(nowTimeLong == beginTimeLong){
			beginTimeStr = "今日（" + date +"） " + time ;
		}else{
			beginTimeStr = "（" + beginTimeStr +"）" ;
		}
		
		return beginTimeStr;
	}
	
	
	
	/**
	 * 根据传入的 Long time, 判断是否在今日
	 */
	public static boolean checkLongIsToday(long longTime){
		boolean isToday = false;
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		long nowTimeLong = calendar.getTimeInMillis();
		
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 0);
		long endTimeLong = calendar.getTimeInMillis();
		
		if(longTime >= nowTimeLong &&  longTime<= endTimeLong){
			isToday = true;
		}
		
		return isToday;
	}
	
	public static int getQuarterly(Date date)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		int quarter = 0;
		switch (month)
		{
			case Calendar.JANUARY	:
			case Calendar.FEBRUARY	:
			case Calendar.MARCH		:
				quarter = 1;
				break;
			case Calendar.APRIL		:
			case Calendar.MAY		:
			case Calendar.JUNE		:
				quarter = 2;
				break;
			case Calendar.JULY		:
			case Calendar.AUGUST		:
			case Calendar.SEPTEMBER		:
				quarter = 3;
				break;
			case Calendar.OCTOBER		:
			case Calendar.NOVEMBER		:
			case Calendar.DECEMBER		:
				quarter = 4;
				break;
		}
		return quarter;
	}
	
}
