package epam.BehavioralDesign;

public class Chat extends User{
	public Chat(ChatBoxI room, String id, String name) {
        super(room, id, name);
    }
 
    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg, userId);
    }
 
    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }

}
