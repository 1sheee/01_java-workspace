package com.br.collection.controller;

import java.util.ArrayList;
import java.util.List;

import com.br.collection.model.vo.Music;

// 사용자의 특정 요청을 처리해주는 클래스
public class MusicController {//s
	
	private List<Music> list = new ArrayList<>();
	{ // 초기화 블럭 (샘플데이터 작성담을 때)
		list.add(new Music("rain", "태연"));
		list.add(new Music("가시", "버즈"));
		list.add(new Music("onelove", "mc the max"));
		list.add(new Music("은인", "버즈"));
		list.add(new Music("그대는 눈물겹다", "mc the max"));
		list.add(new Music("그대라는 사치", "한동근"));
	}

	
	// 각 요청별 실행 될 메소드
	
	public void insertMusic(String title, String artist) {
		// 전달받은 곡명과 가수명을 가지고
		// Music 객체 생성해서 list에 추가
		list.add(new Music(title, artist));
		
	}


	public List<Music> selectMusicList() {
		return list;
	}
	
	public int deleteMusic(String title) {
		// list내에 있는 Music 객체들 중에서
		// 전달 받은 곡명과 일치하는 Music객체 삭제
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result++;
				break;
			}
		}
		
		// result = 0(삭제할 곡을 찾지 못함) | 1(성공적으로 삭제)
		return result;
	}
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		int result = 0;
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result++;
				break;
			}
		}
		return result; // result = 0 | 1
	}


	public List<Music> selectMusicByKeyword(String keyword) {
		
		// 검색된 Music 객체를 담기 위한 리스트 생성
		List<Music>searchList = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
				
				break;
			}
		}
	
		// searchList = 텅빈상태(검색결과가 없었음)
		return searchList;
	}
	
	public List<String> hsh(String Artist) {
		
		List<String> sh = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getArtist().equals(Artist)) {
				sh.add(list.get(i).getTitle());
				
			}
		}
		return sh;
	}

	/*
	 * 곡명을 전달받아
	 * 해당 곡명이 포함되어있는게 총 몇개인지 반환
	 * 
	 */
	
	public int cTitle(String title) {
		int count = 0;
		for(int i = 0; i <list.size(); i++) {
			if(list.get(i).getTitle().replace(" ", "").contains(title.replace(" ", ""))) {
				count++;
			}
		}
		return count;
	}
	
	
	
	
	
	
	
}//e
