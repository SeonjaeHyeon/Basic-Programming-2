// Exercise 4-1

class TV {
    private String model;
    private int year;
    private int size;

    public TV(String m, int y, int s) {
        this.model = m;
        this.year = y;
        this.size = s;
    }

    public void show() {
        System.out.println(this.model + "에서 만든 " + this.year + "년형 " + this.size + "인치 TV");
    }
}

public class ch4exercise1 {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);  // LG에서 만든 2017년 32인치

        myTV.show();
    }
}
