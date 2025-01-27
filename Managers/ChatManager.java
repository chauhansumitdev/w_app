package Managers;

import Person.*;
import Media.*;
import Account.Account;

/**
 * MARK : CHATMANAGER
 * DESC : THIS CLASS CONTAINS THE METHODS TO SEND AND RECEIVE CHATS
 */

public class ChatManager {
    public ChatManager(){}

    /**
     * MARK : SEND_MEDIA
     * DESC : THIS FUNCTION IS USED TO SEND MEDIA TO A PARTICULAR USER
     * @param sender
     * @param receiver
     * @param media
     */
    public void send_media(User sender, Account receiver, Media media){
        receiver.get_chat_manager().receive_media(sender, media);
    }

    /**
     * MARK : RECEIVE_MEDIA
     * DESC : THIS FUNCTION IS USED TO RECEIVE MEDIA FROM A PARTICULAR USER
     * @param sender
     * @param media
     */
    public void receive_media(User sender, Media media){
        System.out.println(" MEDIA RECEIVED ");
        System.out.println(" SENDER : "+ sender);
        System.out.print(" MEDIA : ");

        if(media instanceof Image){
            System.out.println(" IMAGE ");
        }else if(media instanceof Video){
            System.out.println(" VIDEO ");
        }else{
            System.out.println(" TEXT ");
        }
    }
}

