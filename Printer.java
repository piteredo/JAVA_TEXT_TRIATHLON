//
//
// Printer.js
// 2018 @auther piteredo
// This Program is MIT license.
//
//
public class Printer {
	private int indentUinit = 40;
	private String hr = "--------------------------------------";

	public void println(String text){
		System.out.println(text);
	}

	public String getHr(){
		return this.hr;
	}

	public String getIndent(int charId){
		return this.calcIndent(charId);
	}

	private String calcIndent(int charId){
		int i = 0;
		String indent = "";
		while(i < charId * indentUinit){
			indent += " ";
			i++;
		}
		return indent;
	}

	public void printGoodResult(String label, String name, int charId, int restTime, int charPos, String areaName, int distance){
		String verb = "";
		switch(label){
			case "SWIM": verb = "泳いだ。"; break;
			case "RUN": verb = "走った。"; break;
			case "FLY": verb = "飛んだ。"; break;
			case "WALK": verb = "歩いた。"; break;
		}
		System.out.println(
			this.getIndent(charId) + name + "\r\n"
			+ this.getIndent(charId) + " は得意エリアなので思いっきり" + verb + "\r\n"
			+ this.getIndent(charId) + distance + " マス進んだ！ " + restTime/1000 + " 秒休憩します。 \r\n"
			+ this.getIndent(charId) + "[現在地: " + charPos + "  " + areaName + "]\r\n"
			+ this.getIndent(charId) + this.getHr() + "\r\n\r\n"
		);
	}

	public void printSoSoResult(String label, String name, int charId, int restTime, int charPos, String areaName, int distance){
		String verb = "";
		switch(label){
			case "SWIM": verb = "泳いだ。"; break;
			case "RUN": verb = "走った。"; break;
			case "FLY": verb = "飛んだ。"; break;
			case "WALK": verb = "歩いた。"; break;
		}
		System.out.println(
			this.getIndent(charId) + name + "\r\n"
			+ this.getIndent(charId) + " はまあまあエリアなので趣味程度に" + verb + "\r\n"
			+ this.getIndent(charId) + distance + " マス進んだ。 " + restTime/1000 + " 秒休憩します。 \r\n"
			+ this.getIndent(charId) + "[現在地: " + charPos + "  " + areaName + "]\r\n"
			+ this.getIndent(charId) + this.getHr() + "\r\n\r\n"
		);
	}

	public void printBadResult(String label, String name, int charId, int restTime, int charPos, String areaName, int distance){
		String verb = "";
		switch(label){
			case "SWIM": verb = "泳いだ。"; break;
			case "RUN": verb = "走った。"; break;
			case "FLY": verb = "飛んだ。"; break;
			case "WALK": verb = "歩いた。"; break;
		}
		System.out.println(
			this.getIndent(charId) + name + "\r\n"
			+ this.getIndent(charId) + " は苦手エリアなので地道に" + verb + "\r\n"
			+ this.getIndent(charId) + distance + " マス進んだ。 " + restTime/1000 + " 秒休憩します。 \r\n"
			+ this.getIndent(charId) + "[現在地: " + charPos + "  " + areaName + "]\r\n"
			+ this.getIndent(charId) + this.getHr() + "\r\n\r\n"
		);
	}

	public void printGoal(int charId){
		System.out.println(this.getIndent(charId) + "ゴールしました！");
	}
}
