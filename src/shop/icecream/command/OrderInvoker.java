package shop.icecream.command;

import java.util.ArrayList;
import java.util.List;

public class OrderInvoker {
	private List<Command> commandQueue = new ArrayList();

    public void addToQueue(Command command) {
        commandQueue.add(command);
    }

    public void processCommands() {
        for (Command command : commandQueue) {
            command.execute();
        }
        commandQueue.clear();
    }

}
