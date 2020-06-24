package udemy_exercises.songs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<udemy_exercises.songs.Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<udemy_exercises.songs.Song>();
    }
    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new udemy_exercises.songs.Song(title, duration));
            return true;
        }
        return false;
    }
    private udemy_exercises.songs.Song findSong(String title) {
        for(udemy_exercises.songs.Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList (int trackNumber, LinkedList<udemy_exercises.songs.Song> playList) {
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<udemy_exercises.songs.Song> playList) {
        udemy_exercises.songs.Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This song " + title + " is not in this album.");
        return false;
    }




}

/*
**Song Player w/ Java Classes**
     - **Album class** 
       - Playlist of **Songs**.
       - addPlayist() (songs must appear in the list in the order by which they were added)
       - stop()
       - nextSong()
       - previousSong()
       - repeatSong()
       - showPlaylist()
       - removePlaylist()
     - **A song must exist in an album before it can be added to the playlist (so you can only play songs that you own.)**
*/