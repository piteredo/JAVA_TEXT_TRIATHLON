//
//
// RaceMultiThread.js
// 2018 @auther piteredo
// This Program is MIT license.
//
//
public class RaceMultiThread extends Thread {
	private Map map;
	private Character ch;

	RaceMultiThread(Map map, Character ch){
		this.setMap(map);
		this.setCharacter(ch);
	}

	private void setMap(Map map){
		this.map = map;
	}

	private void setCharacter(Character ch){
		this.ch = ch;
	}

	public void run(){
		//本当はスタート前の各キャラ処理とかここに

		while(this.ch.getPosition() < this.map.getMapLength()){
			int restTime = this.ch.action();
			try{
				sleep(restTime);
			}
			catch(Exception e){}
		}
	}
}
