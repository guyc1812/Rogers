package com.avengers.Rogers.DesignPattern.Command.Commands;

import com.avengers.Rogers.DesignPattern.Command.Command;
import com.avengers.Rogers.DesignPattern.Command.Object.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
    }
}
