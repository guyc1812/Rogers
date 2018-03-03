package com.avengers.Rogers.designPattern.Command.Commands;

import com.avengers.Rogers.designPattern.Command.Command;
import com.avengers.Rogers.designPattern.Command.Object.Stereo;

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
