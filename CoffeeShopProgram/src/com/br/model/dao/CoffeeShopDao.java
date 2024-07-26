package com.br.model.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.br.model.vo.User;

public class CoffeeShopDao {
	
	/*
	 * 사용자가 결제 요청시 실행되는 메소드 
	 * 사용자 정보(이름, 장바구니리스트)가 담겨있는 객체를 전달받아
	 * payment 폴더에 
	 * 고객명_결제일.dat 파일로 장바구니리스트 내의 상품정보들이 저장됨 
	 */
	public void paymentFileSave(User user) {
		
		String fileName = user.getUserName() + "_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".dat";
		
		List<Object> cartList = user.getCart();
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("payment\\" + fileName))){
			for(Object o : cartList) {
				oos.writeObject(o);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * 관리자의 매출관리 기능 중 전체 판매내역 조회 요청시 실행되는 메소드
	 * 
	 * payment 폴더에 있는 전체 파일 정보를 읽어들여 반환됨
	 * 이때 반환되는 맵의 형태는 
	 * {
	 * 	 "고객1":[커피객체
	 * 			, 빵객체
	 * 			, 빵객체
	 * 			, ...],
	 *   "고객2":[빵객체
	 *   		, 커피객체
	 *   		, 커피객체
	 *   		, ...]
	 * }
	 * 다음과 같음
	 */
	public Map<String, List<Object>> paymentFileRead(){
		
		Map<String, List<Object>> paymentMap = new HashMap<>();
		
		File paymentFolder = new File("payment");
		File[] paymentFileList = paymentFolder.listFiles();
		
		if(paymentFileList != null) {
			for(File paymentFile : paymentFileList) {
				
				String fileName = paymentFile.getName();
				String userName = fileName.substring(0, fileName.indexOf("_"));
				
				List<Object> paymentList = null;
				
				if(paymentMap.containsKey(userName)) {
					paymentList = paymentMap.get(userName);
				}else {
					paymentList = new ArrayList<Object>();
				}
				
				try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("payment\\" + fileName))){
					while(true) {
						paymentList.add(ois.readObject());					
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch(EOFException e) {
					
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				
				paymentMap.put(userName, paymentList);
			}
		}
		
		
		return paymentMap;
	}
	
	/*
	 * 관리자의 매출관리 기능 중 특정 고객 판매내역 조회 요청시 실행되는 메소드
	 * 
	 * 전달받은 고객명에 해당 하는 파일들을 payment 폴더내에서 찾아
	 * List로 정보를 담아 반환
	 */
	public List<Object> paymentFileReadByUserName(String userName){
		List<Object> paymentList = new ArrayList<>();
		
		File paymentFolder = new File("payment");
		File[] paymentFileList = paymentFolder.listFiles();
		
		if(paymentFileList != null) {
			for(File paymentFile : paymentFileList) {
				String fileName = paymentFile.getName();
				if(fileName.substring(0, fileName.indexOf("_")).equals(userName)) {
					try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("payment\\" + fileName))){
						while(true) {
							paymentList.add(ois.readObject());					
						}
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch(EOFException e) {
						
					} catch (IOException e) {
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		
		return paymentList;
	}
	
	

}
