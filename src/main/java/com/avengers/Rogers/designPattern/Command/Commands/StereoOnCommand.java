package com.avengers.Rogers.designPattern.Command.Commands;

import com.avengers.Rogers.designPattern.Command.Command;
import com.avengers.Rogers.designPattern.Command.Object.Stereo;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
    }

    public void undo() {
        stereo.off();
    }
}
