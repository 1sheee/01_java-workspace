package com.hw2.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import com.hw2.common.DateCalculator;
import com.hw2.common.MathCalculator;
import com.hw2.common.StringCalculator;
import com.hw2.model.vo.FoodShop;

public class Calculator implements StringCalculator, MathCalculator, DateCalculator {

	@Override
	public void printNowDateTime() {
		
		String dateTime = LocalDateTime.now().toString();
		System.out.println(dateTime.replace("T", " ").substring(0, dateTime.indexOf(".")));
		
	}

	@Override
	public Calendar makeCalendar(String year, String month, String date) {
		/*
		Calendar cal = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(date));
		return cal;
		*/
		return new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(date));
	}

	@Override
	public void printFormat(Calendar calc) {
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println("\n" + sdf.format(cal.getTimeInMillis()));
		*/
		System.out.println("\n" + new SimpleDateFormat("yyyy-MM-dd E요일").format(calc.getTimeInMillis()));
	}

	@Override
	public boolean isLeapYear(int year) {
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}

	@Override
	public long leapDate(int startYear, int endYear) {
		
		if(startYear > endYear) {
			return -1;
		}
		
		long dday = 0;
		for(int year=startYear; year<=endYear; year++) {
			if(isLeapYear(year)) {
				dday += 366;
			}else {
				dday += 365;
			}
		}
		return dday;
	}

	@Override
	public int sumString(String num1, String num2) {
		/*
		double parseNum1 = Double.parseDouble(num1);
		double parseNum2 = Double.parseDouble(num2);

		return (int)Math.round(parseNum1 + parseNum2);
		*/
		
		return (int)Math.round(Double.parseDouble(num1) + Double.parseDouble(num2));
	}

	@Override
	public int minusString(String num1, String num2) {
		
		if(num1.contains(".") || num2.contains(".")) {
			return -1;
		}
		/*
		int parseNum1 = Integer.parseInt(num1);
		int parseNum2 = Integer.parseInt(num2);
		
		return Math.abs(parseNum1 - parseNum2);
		*/
		return Math.abs(Integer.parseInt(num1) - Integer.parseInt(num2));
	}

	@Override
	public int findCharCount(String str, char ch) {
		// 다 대문자로 변환시켜서 비교하기 
		
		char[] upperArr = str.toUpperCase().toCharArray(); // ['A', 'P', 'P', 'L', 'E']
		char upperCh = String.valueOf(ch).toUpperCase().charAt(0);
		
		int count = 0;
		for(int i=0; i<upperArr.length; i++) {
			if(upperArr[i] == upperCh) {
				count++;
			}
		}
		
		return count;
	}

	@Override
	public int selectTokenCount(String str) {
		return new StringTokenizer(str, " ").countTokens();
	}

	@Override
	public String toSpaceUpper(String str) { // ex) "apple kiwi pineapple"
		
		String[] splitArr = str.split(" "); // ["apple", "kiwi", "pineapple"]
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<splitArr.length; i++) {
			sb.append(String.valueOf(splitArr[i].charAt(0)).toUpperCase() + splitArr[i].substring(1) + " "); // 0번인덱스일 경우 sb.append("A" + "pple" + " ")
		}
		
		return sb.toString();
	}

	@Override
	public FoodShop[] csvFormat() {
		String csvStr =   "1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
						+ "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11\n"
						+ "3,송정떡갈비,광주광역시 광산구 광산로29번길 1,062-944-1439,향토맛집,2022-01-11\n"
						+ "4,홍춘이,광주광역시 북구 무등로180번길 9-18,062-521-7733,향토맛집,2022-01-11\n"
						+ "5,종가집떡갈비,광주광역시 광산구 상무대로 226,062-943-8282,향토맛집,2022-01-11\n"
						+ "6,광신보리밥,광주광역시 북구 두리봉길 2-1(두암동),062-264-1811,향토맛집,2022-01-11\n"
						+ "7,조선옥,광주광역시 남구 효덕로 103,062-654-3322,한상맛집,2022-01-11\n"
						+ "8,송원회관,광주광역시 북구 경양로135번길 29(신안동),062-529-3250,한상맛집,2022-01-11\n"
						+ "9,만선당어부의밥상,광주광역시 광산구 수완로11번길 3,062-955-5595,한상맛집,2022-01-11\n"
						+ "10,백년미가(유촌점),광주광역시 서구 유덕로28번길 18,062-946-3392,한상맛집,2022-01-11";
		
		
		String[] shops = csvStr.split("\n"); // ["1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11", "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11" ..]
		// 각 인덱스자리에는 한 가게 정보가 담겨있을 것 (== shops.length == 가게 갯수)
		
		FoodShop[] shopArr = new FoodShop[shops.length]; 
		for(int i=0; i<shops.length; i++) {
			String[] arr = shops[i].split(","); // 한 가게마다 ,로 분리시켜 순번, 가게명, 주소, 등등을 각각의 문자열로.. 즉, ["1", "맘스쿡", "광주광역시 동구 동계천로143", "062-233-1233", ..]
			shopArr[i] = new FoodShop(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5]); // "1"문자열 순번을 FoodShop의 int형 순번 필드에 바로 못담으니 파싱해서
		}
		
		return shopArr;
	}

	
}
