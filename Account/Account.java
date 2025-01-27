package Account;

import Managers.ChatManager;
import Managers.ContactManager;
import Managers.StatusManager;

/**
 * MARK : ACCOUNT
 * DESC: THIS CLASS CONTAINS THE CHATMANAGER, CONTACTMANAGER, STATUSMANAGER FOR A PARTICULAR ACCOUNT
 */

public class Account {

    ChatManager chatManager = new ChatManager();
    ContactManager contactManager = new ContactManager();
    StatusManager statusManager = new StatusManager();


    public Account(){}

    public ChatManager get_chat_manager(){
        return chatManager;
    }

    public ContactManager get_contact_manager(){
        return contactManager;
    }

    public StatusManager get_status_manager(){
        return statusManager;
    }
}
