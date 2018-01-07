package com.avengers.steven.DesignPattern.Command.Commands;

import com.avengers.steven.DesignPattern.Command.Command;
import com.avengers.steven.DesignPattern.Command.Object.TV;

public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.off();
    }

    public void undo() {
        tv.on();
    }
}
