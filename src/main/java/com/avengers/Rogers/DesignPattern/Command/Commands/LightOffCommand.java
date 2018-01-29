package com.avengers.Rogers.DesignPattern.Command.Commands;

import com.avengers.Rogers.DesignPattern.Command.Command;
import com.avengers.Rogers.DesignPattern.Command.Object.Light;

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
