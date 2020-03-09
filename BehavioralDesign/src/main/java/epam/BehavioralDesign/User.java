package epam.BehavioralDesign;

public abstract class User {
	private ChatBoxI mediator;
    
    private String id;
    private String name;
     
    public User(ChatBoxI box, String id, String name){
        this.mediator = box;
        this.name = name;
        this.id = id;
    }
     
    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);
 
    public ChatBoxI getMediator() {
        return mediator;
    }
 
    public String getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }

}
