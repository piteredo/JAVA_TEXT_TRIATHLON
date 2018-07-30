//
//
// Main.js
// 2018 @auther piteredo
// This Program is MIT license.
//
//
public class Main {
	public static void main(String[] args){
		Game game = new Game();
		game.start();
	}
}

class Game {
	private Printer printer;
	private Map map;
	private Character[] charArr;
	private RaceMultiThread[] raceMultiThreadArr;

	public void start(){
		this.init();
	}

	private void init(){
		this.initPrinter();
		this.initMap();
		this.initCharacters();
		this.initRaceThread();

		this.updateScene("TITLE");
	}

	private void initPrinter(){
		this.printer = new Printer();
	}

	private void initMap(){
		this.map = new Map();
		map.init();
	}

	private void initCharacters(){
		this.charArr = new Character[3];
		this.charArr[0] = new SwimMan("【 泳ぐマン 】", 0, this.map, this.printer);
		this.charArr[1] = new BirdMan("【 飛ぶマン 】", 1, this.map, this.printer);
		this.charArr[2] = new WheelMan("【 走るマン 】", 2, this.map, this.printer);
	}

	private void updateScene(String label){
		switch(label){
			case "TITLE": startTitleScene(); break;
			case "MAIN": startMainScene(); break;
			case "RESULT": startResultScene(); break;
		}
	}

	private void initRaceThread(){
		this.raceMultiThreadArr = new RaceMultiThread[this.charArr.length];
		int i = 0;
		for(Character ch : this.charArr){
			this.raceMultiThreadArr[i] = new RaceMultiThread(this.map, ch);
			i++;
		}
	}

	private void startTitleScene(){
		this.printer.println("ゲームタイトル\r\n" + this.printer.getHr() + this.printer.getHr() + this.printer.getHr());
		//本当は一旦停止して入力待ちとか説明とか

		this.updateScene("MAIN");
	}

	private void startMainScene(){
		// for拡張文でマルチ起動できなかったなぜ？？
		//for(RaceMultiThread rmt : this.raceMultiThreadArr){
			//System.out.println(rmt);
			//rmt.run();
		//}

		this.raceMultiThreadArr[0].start();
		this.raceMultiThreadArr[1].start();
		this.raceMultiThreadArr[2].start();
	}

	private void startResultScene(){
		//本当は終了後ここで表彰とか
	}
}
