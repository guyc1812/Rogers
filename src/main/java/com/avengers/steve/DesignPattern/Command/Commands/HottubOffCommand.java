package com.avengers.steve.DesignPattern.Command.Commands;

import com.avengers.core.demo.DesignPattern.Command.Command;
import com.avengers.core.demo.DesignPattern.Command.Object.Hottub;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    public void undo() {
        hottub.on();
    }
}
