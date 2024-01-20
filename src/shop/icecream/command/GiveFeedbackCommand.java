package shop.icecream.command;
public  class GiveFeedbackCommand implements Command {
    private FeedbackReciver feedbackReceiver;

    public GiveFeedbackCommand(FeedbackReciver feedbackReceiver) {
        this.feedbackReceiver = feedbackReceiver;
    }

    @Override
    public void execute() {
        feedbackReceiver.gatherFeedback();
    }

    @Override
    public void undo() {
        feedbackReceiver.deleteFeedback();
    }
}
