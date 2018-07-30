//
//
// Map.js
// 2018 @auther piteredo
// This Program is MIT license.
//
//
public class Map {
	private int[][] mapData;
	private int mapLength;
	private Area waterArea;
	private Area groundArea;
	private Area skyArea;

	public void init(){
		this.initWaterArea();
		this.initGroundArea();
		this.initSkyArea();
		this.mapLength = this.calcMapLength();

		this.createMap();
	}

	private void initWaterArea(){
		String name = "水辺 エリア";
		int areaLength = 6;
		this.waterArea = new WaterArea(name, areaLength);
		this.waterArea.setIsSwimmable(true);
	}

	private void initGroundArea(){
		String name = "平地 エリア";
		int areaLength = 6;
		this.groundArea = new GroundArea(name, areaLength);
		this.groundArea.setIsRunnable(true);
	}

	private void initSkyArea(){
		String name = "空色 エリア";
		int areaLength = 6;
		this.skyArea = new SkyArea(name, areaLength);
		this.skyArea.setIsFlyable(true);
	}

	private int calcMapLength(){
		int len = 0;
		len += this.waterArea.getAreaLength();
		len += this.groundArea.getAreaLength();
		len += this.skyArea.getAreaLength();
		return len;
	}

	private void createMap(){
		this.mapData = new int[3][];
		this.mapData[0] = new int[this.waterArea.getAreaLength()];
		this.mapData[1] = new int[this.groundArea.getAreaLength()];
		this.mapData[2] = new int[this.skyArea.getAreaLength()];
	}

	public String getAreaName(int pos){
		return this.getArea(pos).getName();
	}

	public boolean getIsSwimmable(int pos){
		return this.getArea(pos).getIsSwimmable();
	}

	public boolean getIsRunnable(int pos){
		return this.getArea(pos).getIsRunnable();
	}

	public boolean getIsFlyable(int pos){
		return this.getArea(pos).getIsFlyable();
	}

	private Area getArea(int pos){
		int[][] md = this.mapData;
		if(md[0].length > pos) return this.waterArea;
		else if(md[0].length + md[1].length > pos) return this.groundArea;
		else return this.skyArea;
	}

	public int getMapLength(){
		return this.mapLength;
	}
}
