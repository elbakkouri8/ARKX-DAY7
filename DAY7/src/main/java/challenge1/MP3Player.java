package challenge1;

public class MP3Player extends AudioPlayer{
    public MP3Player(int volume) {
        super(volume);
    }

    @Override
    public void volumeControl(int i) {
        this.setVolume(this.getVolume()+i);
    }

    public void volumeValue(){
        System.out.println(this.getVolume());
    }

    @Override
    public void play() {
        System.out.println("MP3 Player :  start");
    }

    @Override
    public void pause() {
        System.out.println("mp3 Player :  pause");
    }

    @Override
    public void stop() {
        System.out.println("mp3 Player :  stop");
    }
}
