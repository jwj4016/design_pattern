package facade_pattern.sub_system;

public interface Amplifier {

    public void on();

    public void off();

    public void setStreamingPlayer(StreamingPlayer streamingPlayer);

    public void setStereoSound();

    public void setSurroundSound();

    public void setTuner();

    public void setVolume(int volume);
}
