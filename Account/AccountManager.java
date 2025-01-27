package Account;

import java.util.HashMap;
import java.util.*;
import Person.User;

/**
 * MARK : ACCOUNTMANAGER
 * DESC : THIS CLASS IS THE ACCOUNTMANAGER THAT CONTAINS THE MAPPING OF THE USER WITH THEIR RESPECTIVE ACCOUNTS
 */
public class AccountManager {
 
    private static Map<User, Account> accounts = new HashMap<>();

    private static AccountManager account_manager = new AccountManager();

    private  AccountManager(){}

    public static AccountManager get_instance(){
        return account_manager;
    }

    public static Account get_account(User user){
        return accounts.get(user);
    }

    public static void add_account(User user){
        accounts.put(user, new Account());
    }

    public static void delete_account(User user){
        accounts.remove(user);
    }
}
