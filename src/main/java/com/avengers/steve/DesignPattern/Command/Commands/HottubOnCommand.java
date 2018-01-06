package com.avengers.steve.DesignPattern.Command.Commands;

import com.avengers.core.demo.DesignPattern.Command.Command;
import com.avengers.core.demo.DesignPattern.Command.Object.Hottub;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.circulate();
    }

    public void undo() {
        hottub.off();
    }
}
