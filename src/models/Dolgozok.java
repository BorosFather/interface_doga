package models;

public class Dolgozok {
    int id;
    public String name;
    String city;
    public int beoszasId;

    public Dolgozok(int id, String name, String city, int beoszasId){
            this.id = id;
            this.name = name;
            this.city = city;
            this.beoszasId = beoszasId;
    }
}

