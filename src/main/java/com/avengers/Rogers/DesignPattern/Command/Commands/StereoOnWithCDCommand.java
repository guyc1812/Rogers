package com.avengers.Rogers.DesignPattern.Command.Commands;

import com.avengers.Rogers.DesignPattern.Command.Command;
import com.avengers.Rogers.DesignPattern.Command.Object.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo() {
        stereo.off();
    }
}
