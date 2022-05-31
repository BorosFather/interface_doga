/*
* File: Dolgozok.java
* Author: Boros Zoltán
* Copyright: 2022, Boros Zoltán
* Group: Szoft I N
* Date: 2022-05-31
* Github: https://github.com/BorosFather/
* Licenc: GNU GPL
*/

package models;

public class Dolgozok {
    public int id;
    public String name;
    public int beosztasId;

    public Dolgozok(int id, String name,  int beosztasId){
            this.id = id;
            this.name = name;
            this. beosztasId =  beosztasId;
    }
}

