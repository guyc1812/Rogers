package com.avengers.Rogers.designPattern.Command.Commands;

import com.avengers.Rogers.designPattern.Command.Command;
import com.avengers.Rogers.designPattern.Command.Object.TV;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    public void undo() {
        tv.off();
    }
}
