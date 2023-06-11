package com.pack.javabased;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionData {

	List<String> names;
	Set<Integer>pincodes;
	Map<String, Integer>wordcount;
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Set<Integer> getPincodes() {
		return pincodes;
	}
	public void setPincodes(Set<Integer> pincodes) {
		this.pincodes = pincodes;
	}
	public Map<String, Integer> getWordcount() {
		return wordcount;
	}
	public void setWordcount(Map<String, Integer> wordcount) {
		this.wordcount = wordcount;
	}
}
