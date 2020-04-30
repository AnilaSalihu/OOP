package oop.cacttus.education.java9.socialnetwork;

import java.util.ArrayList;

public class User extends BaseAudit{
        private  int id;

        //vetit tjera te userit
        private ArrayList<Album> albums;
        private ArrayList<Post> posts;

        public ArrayList<Album> getAlbums() {
                return albums;
        }

        public void setAlbums(ArrayList<Album> albums) {
                this.albums = albums;
        }

        public ArrayList<Post> getPosts() {
                return posts;
        }

        public void setPosts(ArrayList<Post> posts) {
                this.posts = posts;
        }

        public ArrayList<User> getFriends() {
                return friends;
        }

        public void setFriends(ArrayList<User> friends) {
                this.friends = friends;
        }

        private ArrayList<User> friends;


        public int getId() {
            return  id;
        }


}
