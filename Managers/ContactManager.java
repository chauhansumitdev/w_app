package Managers;

import java.util.*;
import Person.*;
import Account.Account;
import Account.AccountManager;


/**
 * MARK : CONTACTMANAGER
 * DESC : THIS IS THE CONTACT MANAGER CLASS FOR KEEPING A MAP OF USERS WITH THEIR PARTICULAR ACCOUNT
 */
public class ContactManager {
    
    private Map<User, Account> contacts= new HashMap<>();

    public ContactManager(){

    }

    public Account get_account(User user){
        return contacts.get(user);
    }

    public Map<User, Account> get_contacts(){
        return contacts;
    }

    public void add_contact(User user){
        contacts.put(user, AccountManager.get_account(user));
    }

    public void remove_contact(User user){
        contacts.remove(user);
    }
}
