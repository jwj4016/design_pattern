package facade_pattern;

import facade_pattern.sub_system.*;
import facade_pattern.sub_system_impl.*;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new MyAmplifier();
        PopcornPopper popper = new MyPopcornPopper();
        Projector projector = new MyProjector();
        Screen screen = new MyScreen();
        StreamingPlayer streamingPlayer = new MyStreamingPlayer();
        TheaterLights theaterLights = new MyTheaterLights();
        Tuner tuner = new MyTuner();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier,tuner,streamingPlayer,projector,theaterLights,screen,popper);

        homeTheater.watchMovie("인디아나 존스:레이더스");
        homeTheater.endMovie();
    }
}
