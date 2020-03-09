package epam.BehavioralDesign;

public interface ChatBoxI {
    public void sendMessage(String msg, String userId);
    
    void addUser(User user);

}
