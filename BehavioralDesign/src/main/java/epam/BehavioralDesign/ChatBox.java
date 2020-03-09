package epam.BehavioralDesign;

import java.util.HashMap;
import java.util.Map;

public class ChatBox implements ChatBoxI {
	private Map<String, User> users = new HashMap<String, User>();
	 
    public void sendMessage(String msg, String userId) 
    {
        User u = users.get(userId);
        u.receive(msg);
    }
 
    public void addUser(User user) {
        this.users.put(user.getId(), user);
    }

}
