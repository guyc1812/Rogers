package com.avengers.Rogers.designPattern.Command.Commands;

import com.avengers.Rogers.designPattern.Command.Command;
import com.avengers.Rogers.designPattern.Command.Object.Light;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
