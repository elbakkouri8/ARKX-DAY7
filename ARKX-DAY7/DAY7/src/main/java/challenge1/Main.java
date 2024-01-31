package challenge1;

public class Main {
    public static void main(String[] args) {

        CDPlayer cd1=new CDPlayer(5);
        cd1.play();
        cd1.pause();
        cd1.play();
        cd1.stop();
        cd1.volumeControl(8);
        cd1.volumeValue();

        MP3Player mp3  = new MP3Player(3);
        mp3.play();
        mp3.pause();
        mp3.play();
        mp3.stop();
        mp3.volumeValue();


    }
}
