package com.avengers.steven.DesignPattern.Command.Commands;

import com.avengers.steven.DesignPattern.Command.Command;
import com.avengers.steven.DesignPattern.Command.Object.Stereo;

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
