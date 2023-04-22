package day33_a_static;

import java.util.ArrayList;

public class UsingSong {

    public static void main(String[] args) {
          Song song1 = new Song("Waka Waka", 3.3);
          Song song2 = new Song("Yesterday", 3.2, " The Beatles");
          Song song3 = new Song("Here without you", 3.0, "Ruslan", "Rock");

        ArrayList <Song> songList = new ArrayList<>();
        songList.add(song1);
        songList.add(song2);
        songList.add(song3);


        System.out.println(songList);


        for (Song each: songList) {
            System.out.println("-------------");

            System.out.println(each);
        }

        System.out.println("***************************");

songList.removeIf(each -> each.genge == null);
        System.out.println(songList);



        System.out.println("***************************");


        songList.add(song1);
        songList.add(song2);

        songList.removeIf(each -> each.length>3.1);
        System.out.println(songList);





    }









}
