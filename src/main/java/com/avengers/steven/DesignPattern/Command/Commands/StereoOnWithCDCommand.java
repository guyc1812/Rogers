package com.avengers.steven.DesignPattern.Command.Commands;

import com.avengers.steven.DesignPattern.Command.Command;
import com.avengers.steven.DesignPattern.Command.Object.Stereo;

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
