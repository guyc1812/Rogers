package com.avengers.steven.DesignPattern.Command.Commands;

import com.avengers.steven.DesignPattern.Command.Command;
import com.avengers.steven.DesignPattern.Command.Object.TV;

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
