package com.avengers.steven.DesignPattern.Command.Commands;

import com.avengers.steven.DesignPattern.Command.Command;
import com.avengers.steven.DesignPattern.Command.Object.Hottub;

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
