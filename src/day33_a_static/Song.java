package day33_a_static;

public class Song {

    String name;
    double length;
    String artist;
    String genge;

    public Song (String name, double length){
        this.name= name;
        this.length = length;
    }

    public Song (String name, double length, String artist){
        this(name, length);
        this.artist = artist;
    }

    public Song (String name, double length, String artist, String genre){
        this(name, length, artist);
        this.genge= genre;
    }


    @Override
    public String toString() {
        return "Song{" +
                "\nname='" + name +
                "\nlength=" + length +
                "\nartist='" + artist +
                "\ngenge='" + genge ;
    }
}
