//
//
// Character.js
// 2018 @auther piteredo
// This Program is MIT license.
//
//
public abstract class Character {
	protected String name;
	protected int id;
	protected int restTime = 0;
	protected Map map;
	protected Printer printer;
	protected int pos = 0;

	Character(String name, int id, Map map, Printer printer){
		this.setName(name);
		this.setId(id);
		this.setMap(map);
		this.setPrinter(printer);
	}

	protected void setName(String name){
		this.name = name;
	}

	protected void setId(int id){
		this.id = id;
	}

	protected void setMap(Map map){
		this.map = map;
	}

	protected void setPrinter(Printer printer){
		this.printer = printer;
	}

	public abstract int action(); //return restTime;

	protected void updatePosition(int distance){
		this.pos += distance;
	}

	protected void updateRestTime(int milliseconds){
		this.restTime = milliseconds;
	}

	protected void walk(){
		int ms = 1111;
		int dist = 1;
		this.updatePosition(dist);
		this.updateRestTime(ms);
		this.printer.printBadResult("WALK", this.name, this.id, ms, this.pos, this.map.getAreaName(this.pos), dist);
	}

	protected abstract void doSpecialAction();

	public String getName(){
		return this.name;
	}

	public int getId(){
		return this.id;
	}

	public int getPosition(){
		return this.pos;
	}
}
