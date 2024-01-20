package shop.icecream.command;

import shop.icecream.models.Order;

public interface Command {
    void execute();
    void undo();
}
