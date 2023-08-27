package com.mani.simple;

import java.util.Iterator;
import java.util.Set;

public class PlayClient {

	SongsApp sa;
	Set<String> spInit;

	// Set<String> userInit;
	public void initPlayApp() {

		sa = new SongsApp();

		spInit = sa.getSongPool();
		spInit.add("S1");
		spInit.add("S2");
		spInit.add("S3");
		spInit.add("S4");
		spInit.add("S5");
		spInit.add("S6");
		spInit.add("S7");
		spInit.add("S8");
		spInit.add("S9");
		spInit.add("S10");
		spInit.add("S11");
		spInit.add("S12");
		// userInit = sa.getUserPool();
		// userInit.add("tester");
		// userInit.add("mani");
		// userInit.add("QAgal");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		PlayClient pa = new PlayClient();
		pa.initPlayApp();
		// Iterator<String> it = pa.userInit.iterator();
		// PlayList myPL = new PlayList(it.next());
		PlayList maniPL = new PlayList("Mani");
		PlayList QAGalPL = new PlayList("QAGal");

		maniPL.createPlaylist(pa.spInit);

		maniPL.displayPlayList();

		maniPL.PlaySong("S2");
		Thread.sleep(100);
		maniPL.PlaySong("S3");
		Thread.sleep(100);
		maniPL.PlaySong("S7");
		Thread.sleep(100);

		maniPL.PlaySong("S2");
		Thread.sleep(100);
		maniPL.PlaySong("S1");
		Thread.sleep(100);
		maniPL.PlaySong("S8");
		Thread.sleep(100);

		maniPL.PlaySong("S12");
		Thread.sleep(100);
		maniPL.PlaySong("S11");
		Thread.sleep(100);
		maniPL.PlaySong("S10");
		Thread.sleep(100);
		maniPL.displayRecentlyPlayedList();
		QAGalPL.PlaySong("S4");

		QAGalPL.displayPlayList();
		QAGalPL.displayRecentlyPlayedList();

	}

}
