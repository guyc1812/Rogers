package com.avengers.Rogers.DesignPattern.Command.Commands;

import com.avengers.Rogers.DesignPattern.Command.Command;
import com.avengers.Rogers.DesignPattern.Command.Object.Hottub;

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
