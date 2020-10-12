// Exercise 5-2

class TV {
    private int size;
    
    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }

}

class ColorTV extends TV {
    private int color;

    public ColorTV(int size, int color) {
        super(size);

        this.color = color;
    }

    protected int getColor() {
        return this.color;
    }

    public void printProperty() {
        System.out.println(getSize() + "인치 " + this.color + "컬러");
    }
}

class IPTV extends ColorTV {
    private String ip;

    public IPTV(String ip, int size, int color) {
        super(size, color);

        this.ip = ip;
    }

    protected String getIp() {
        return this.ip;
    }

    public void printProperty() {
        System.out.println("나의 IPTV는 " + this.ip + " 주소의 " + getSize() + "인치 " + getColor() + "컬러");
    }
}

public class ch5exercise2 {
    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.0.0.1", 32, 2048);

        iptv.printProperty();
    }
}
