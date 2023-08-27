package com.mani.simple;

import java.util.HashSet;
import java.util.Set;

public class SongsApp {

	Set<String> songPool;

	// Set<String> userPool;

	public SongsApp() {

		// TODO Auto-generated constructor stub
		songPool = new HashSet<String>();
		// userPool = new HashSet<String>();
	}

	public SongsApp(Set<String> songPool, Set<String> userPool) {
		super();
		this.songPool = songPool;
		// this.userPool = userPool;
	}

	public Set<String> getSongPool() {
		return songPool;
	}

	public void setSongPool(Set<String> songPool) {
		this.songPool = songPool;
	}

//	public Set<String> getUserPool() {
	// return userPool;
//	}

//	public void setUserPool(Set<String> userPool) {
//		this.userPool = userPool;
//	}

}
