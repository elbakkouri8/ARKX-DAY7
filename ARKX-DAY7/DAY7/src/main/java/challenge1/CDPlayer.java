package challenge1;
public class CDPlayer extends AudioPlayer{
    public CDPlayer(int volume) {
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
        System.out.println("CD Player :  start");
    }

    @Override
    public void pause() {
        System.out.println("CD Player : pause");

    }

    @Override
    public void stop() {
        System.out.println("CD Player : stop");

    }
}
