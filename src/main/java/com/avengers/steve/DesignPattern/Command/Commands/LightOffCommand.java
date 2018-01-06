package com.avengers.steve.DesignPattern.Command.Commands;

import com.avengers.core.demo.DesignPattern.Command.Command;
import com.avengers.core.demo.DesignPattern.Command.Object.Light;

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
