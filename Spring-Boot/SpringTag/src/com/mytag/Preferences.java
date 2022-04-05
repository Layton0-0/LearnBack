package com.mytag;

import java.util.ArrayList;
import java.util.List;

public class Preferences {
	private boolean receiveNewsletter;

	private String[] interests;

	private String favouriteWord;
	
	private List<String>  interestList;
	private List<String>  skills;
	
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public void setInterestList(List<String> interestList) {
		this.interestList = interestList;
	}

	public List<String> getInterestList() {
		interestList = new ArrayList<>();
		  interestList.add("������");
		  interestList.add("ȭ����");
		  interestList.add("������");
		  interestList.add("�����");
		return interestList;
	}
	

	public boolean isReceiveNewsletter() {
		return receiveNewsletter;
	}

	public void setReceiveNewsletter(boolean receiveNewsletter) {
		this.receiveNewsletter = receiveNewsletter;
	}

	public String[] getInterests() {
		return  interests;
	}

	public void setInterests(String[] interests) {
		this.interests = interests;
	}

	public String getFavouriteWord() {
		return favouriteWord;
	}

	public void setFavouriteWord(String favouriteWord) {
		this.favouriteWord = favouriteWord;
	}

}
