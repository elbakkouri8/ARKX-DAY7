package challenge1;

public abstract class AudioPlayer implements IPlayable{

    private int volume;

    public AudioPlayer(int volume) {
        this.volume = volume;
    }

    public abstract void volumeControl(int t);
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

}
