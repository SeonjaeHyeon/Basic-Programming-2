// Exercise 4-3

class Song {
    private String title;
    private String artist;
    private int year;
    private String country;

    public Song() {;}

    public Song(String t, String a, int y, String c) {
        this.title = t;
        this.artist = a;
        this.year = y;
        this.country = c;
    }

    public void show() {
        System.out.println(this.year + "년 " + this.country + "국적의 " + this.artist + "이/가 부른 " + this.title);
    }
}

public class ch4exercise3 {
    public static void main(String[] args) {
        Song mysong = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");

        mysong.show();
    }
}
