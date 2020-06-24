package udemy_exercises.songs;

import java.util.*;

public class Main {
    private static ArrayList<udemy_exercises.songs.Album> albums = new ArrayList<udemy_exercises.songs.Album>();
    public static void main(String[] args) {

      udemy_exercises.songs.Album album = new udemy_exercises.songs.Album("Strormbringer", "Deep Purple");
      album.addSong("Stormbringer", 4.6);
        album.addSong("While You Were Here", 4.22);
        album.addSong("Terrified", 4.3);
        album.addSong("Stand Tall", 5.6);
        album.addSong("The Weekend", 3.21);
        album.addSong("Love Galore", 6.12);
        album.addSong("Other Side of the Game", 4.37);
        album.addSong("Something Keeps Calling", 7.57);
        album.addSong("Those Who Wait", 5.15);
        album.addSong("She Got Kids", 3.15);
        albums.add(album);

        album = new udemy_exercises.songs.Album("Songs in A Minor", "Alicia Keys");
                album.addSong("Goodbye", 4.21);
                album.addSong("Piano and I", 5.18);
                album.addSong("Never Felt This Way", 7.19);
                album.addSong("Fallin'", 5.43);
                album.addSong("Rock Wit U", 7.34);
                album.addSong("Jane Doe", 3.12);
                album.addSong("The Life", 5.24);
                albums.add(album);


        LinkedList<udemy_exercises.songs.Song> playList = new LinkedList<udemy_exercises.songs.Song>();
        albums.get(0).addToPlayList("While You Were Here", playList);
        albums.get(0).addToPlayList("Love Galore", playList);
        albums.get(0).addToPlayList("While You Were Here", playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(7, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(5, playList);
        albums.get(1).addToPlayList(1, playList);

        play(playList);

    }

    private static void play(LinkedList<udemy_exercises.songs.Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<udemy_exercises.songs.Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist!");
            return;
        } else {
            System.out.println("Now Playing " + listIterator.next().toString());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit=true;
                    break;

                case 1:
                    if(!forward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now Playing " + listIterator.next().toString());
                    } else {
                        System.out.println("You have reached the end of the playlist!");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now Playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("You are at the beginning of the playlist!");
                        forward = true;
                    }
                    break;


                case 3:
                    if(forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now Replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("You are at the beginning of the playlist!");
                        }
                    } else {
                        if(listIterator.hasNext()) {
                            System.out.println("Now Replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("You have reached the end of the playlist!");
                        }
                    }
                    break;

                case 4: printList(playList);
                break;

                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()) {
                            System.out.println("Now Playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now Playing " + listIterator.previous());
                        }
                    }
                    break;

            }
        }
    }

    public static void printMenu() {
        System.out.println("Available Options: \npress");
        System.out.println("O - to quit\n" +
                            "1 - to play next song\n" +
                            "2 - to play previous song\n" +
                            "3 - to repeat the current song\n" +
                            "4 - list songs in the playlist\n" +
                            "5 - print available options" +
                            "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<udemy_exercises.songs.Song> playList) {
        Iterator<udemy_exercises.songs.Song> iterator = playList.iterator();
        System.out.println("===============================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===============================");
    }





















}
