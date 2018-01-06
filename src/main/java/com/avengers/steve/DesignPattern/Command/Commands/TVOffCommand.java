package com.avengers.steve.DesignPattern.Command.Commands;

import com.avengers.core.demo.DesignPattern.Command.Command;
import com.avengers.core.demo.DesignPattern.Command.Object.TV;

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
