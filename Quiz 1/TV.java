// 60201716 현선재

public class TV {
	String maker;
	int year;
	int size;
	
	public TV(String maker, int year, int size) {
		this.maker = maker;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.println(maker + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
