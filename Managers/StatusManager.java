package Managers;

import Person.User;
import Media.Media;
import java.util.*;
import Account.Account;

/**
 * MARK : STATUSMANAGER
 * DESC : THIS CLASS IS USED TO MANAGE THE STATUS
 */
public class StatusManager {

    Map<User, Media> statuses = new HashMap<>();
    
    public void set_status( ContactManager contactManager, Media media ){
        Map<User, Account> accounts = contactManager.get_contacts();

        for(Map.Entry<User, Account> entry : contactManager.get_contacts().entrySet()){
            System.out.println(" STATUS SENT TO : "+ entry.getKey());
            entry.getValue().get_status_manager().receive_status(entry.getKey(), media);
        }
    }

    public void receive_status(User user, Media media){

        System.out.println(" STATUS RECEIVED FROM : "+user+ "  MEDIA  : "+ media);
        statuses.put(user, media);
    }

    public void display_status(){
        for(Map.Entry<User, Media> entry : statuses.entrySet()){
            System.out.println(entry.getKey());
            System.err.println(entry.getValue());
        }
    }

}
