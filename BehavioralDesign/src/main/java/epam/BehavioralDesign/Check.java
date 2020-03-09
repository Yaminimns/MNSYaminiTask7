package epam.BehavioralDesign;

public class Check {
	public static void main(String[] args) 
    {
        ChatBoxI chat = new ChatBox();
         
        User user1 = new Chat(chat,"1", "Yamini");
        User user2 = new Chat(chat,"2", "Shravya");
        User user3 = new Chat(chat,"3", "Vani");
        User user4 = new Chat(chat,"4", "Pravi");
         
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);
        chat.addUser(user4);
 
        user3.send("Hello Shravya", "2");
        user2.send("Hey bruh", "4");
    }

}
