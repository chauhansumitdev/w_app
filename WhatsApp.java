import Account.AccountManager;
import Media.Image;
import Media.Video;
import Person.User;

public class WhatsApp {
    public static void main(String[] args) {
        
        User user_one = new User("user_one");
        User user_two = new User("user_two");


        AccountManager.add_account(user_one);
        AccountManager.add_account(user_two);



        AccountManager.get_account(user_one).get_contact_manager().add_contact(user_two);



        AccountManager.get_account(user_one).get_chat_manager().send_media(user_one, AccountManager.get_account(user_one).get_contact_manager().get_account(user_two), new Image());


        AccountManager.get_account(user_one).get_status_manager().set_status(AccountManager.get_account(user_one).get_contact_manager(), new Video());
    }
}
