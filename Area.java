//
//
// Area.js
// 2018 @auther piteredo
// This Program is MIT license.
//
//
public class Area {
	protected String name;
	protected int areaLength;
	protected boolean isSwimmable = false;
	protected boolean isRunnable = false;
	protected boolean isFlyable = false;

	Area(String name, int len){
		this.setName(name);
		this.setAreaLength(len);
	}

	protected void setAreaLength(int len){
		this.areaLength = len;
	}

	protected void setName(String name){
		this.name = name;
	}

	protected void setIsSwimmable(boolean boo){
		this.isSwimmable = boo;
	}

	protected void setIsRunnable(boolean boo){
		this.isRunnable = boo;
	}

	protected void setIsFlyable(boolean boo){
		this.isFlyable = boo;
	}

	public int getAreaLength(){
		return this.areaLength;
	}

	public String getName(){
		return this.name;
	}

	public boolean getIsSwimmable(){
		return this.isSwimmable;
	}

	public boolean getIsRunnable(){
		return this.isRunnable;
	}

	public boolean getIsFlyable(){
		return this.isFlyable;
	}
}
