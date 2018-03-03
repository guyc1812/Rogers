package com.avengers.Rogers.designPattern.Command.Commands;

import com.avengers.Rogers.designPattern.Command.Command;
import com.avengers.Rogers.designPattern.Command.Object.Hottub;

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
