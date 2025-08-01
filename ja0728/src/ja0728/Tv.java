package ja0728;

public class Tv {
	
    String color;
    boolean power;
    int channel;

    // 2. 메소드
    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
