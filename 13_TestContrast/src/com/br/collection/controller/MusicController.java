package com.br.collection.controller;

import java.util.ArrayList;
import java.util.List;

import com.br.collection.model.vo.Music;

public class MusicController {
	
	private List<Music> list = new ArrayList<>();
	{	list.add(new Music("rain", "태연"));
		list.add(new Music("rain", "윤도현"));
		list.add(new Music("닭", "태민"));
		
		
	}
	
	public void input(String title, String artist) {
		list.add(new Music(title,artist));
		
	}
	
	public List<Music> selectmusic(){
		return list;
	}
	
	public int deleteMusic(String title) {
		int result = 0;
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().replace(" ","").equals(title.replace(" ", ""))) {
				list.remove(i);
				result++;
				//break;
			}
		}
		return result;
	}
	
	public List<Music> searchMusic(String title){
		List<Music> find = new ArrayList<>();
		for(int i = 0; i < list.size() ; i++) {
			if(list.get(i).getTitle().contains(title)) {
				find.add(list.get(i));
			}
		}
		return find;
	}
	
	public int updatemusic(String title, String uptitle, String upartist) {
		int result = 0;
		for(int i = 0; i <list.size() ; i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(uptitle);
				list.get(i).setArtist(upartist);
				result++; // 해야됨
				break;
			}
		}
		return result;
	}
	
	public List<String> gasusearch(String artist){
		List<String> search2 = new ArrayList<>();
		for(int i = 0; i < list.size() ; i++) {
			if(list.get(i).getArtist().equals(artist)) {
				search2.add(list.get(i).getTitle());
				
			}
			
		}
		return search2;
		
	}
	
	public int countgok(String title) {
		int count = 0;
		for(int i = 0; i < list.size() ; i++) {
			if(list.get(i).getTitle().contains(title)) {
				count++;
			}
		}
		return count;
	}
	
}


	
	
