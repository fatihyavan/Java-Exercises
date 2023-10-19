import Implementation.Gmail;
import Implementation.Outlook;
import Implementation.Sender;
import Interface.Provider;

public class Main {
    public static void main(String[] args) {

    Provider email1 = new Outlook();
    Sender sender = new Sender(email1);
    sender.Publish();

    }
}