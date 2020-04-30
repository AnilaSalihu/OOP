package oop.cacttus.education.java9.socialnetwork;

import java.util.ArrayList;

public class UserManager {
    public static ArrayList<User> users = new ArrayList<>();
    //ketu krijohet useri, krijohet albimi , shtohen fotot ne album, shtohen friends

    public void registerUser(User user) {
        users.add(user);
    }
    public void createAlbum(int userId, Album a) {
        User user = getUser(userId);

        if(user!=null) {
            //user.addAlbum(a);
            ArrayList<Album> albums = user.getAlbums();
            albums.add(a);
            user.setAlbums(albums);
        }
    }

    public User getUser(int id) {
        for(User user: users) {
            if(user.getId()==id) return user;
        }
        return  null;
    }

}
