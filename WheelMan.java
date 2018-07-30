//
//
// WheelMan.js
// 2018 @auther piteredo
// This Program is MIT license.
//
//
class WheelMan extends Character implements IRun, ISwim{

	WheelMan(String name, int id, Map map, Printer printer){
		super(name, id, map, printer);
	}

	public int action(){
		boolean isRunnable = this.map.getIsRunnable(this.pos);
		boolean isSwimmable = this.map.getIsSwimmable(this.pos);
		if(isRunnable){
			this.run();
			if(this.pos >= this.map.getMapLength()) this.printer.printGoal(this.id);
			return this.restTime;
		}
		else if(isSwimmable){
			this.swim();
			if(this.pos >= this.map.getMapLength()) this.printer.printGoal(this.id);
			return this.restTime;
		}
		else{
			this.walk();
			if(this.pos >= this.map.getMapLength()) this.printer.printGoal(this.id);
			return this.restTime;
		}
	}

	public void doSpecialAction(){
		//TODO
		//abstract method 勉強のため、本当はランダムでこのメソッド呼んでキャラ別アクションとか
	}

	public void run(){
		int ms = 4444;
		int dist = 7;
		this.updatePosition(dist);
		this.updateRestTime(ms);
		this.printer.printGoodResult("RUN", this.name, this.id, ms, this.pos, this.map.getAreaName(this.pos), dist);
	}

	public void swim(){
		int ms = 2222;
		int dist = 3;
		this.updatePosition(dist);
		this.updateRestTime(ms);
		this.printer.printSoSoResult("SWIM", this.name, this.id, ms, this.pos, this.map.getAreaName(this.pos), dist);
	}
}
