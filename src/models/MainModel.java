/*
* File: MainModel.java
* Author: Boros Zoltán
* Copyright: 2022, Boros Zoltán
* Group: Szoft I N
* Date: 2022-05-31
* Github: https://github.com/BorosFather/
* Licenc: GNU GPL
*/

package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    
    Beosztas[] beosztasArray = {
        new Beosztas(1 ,"Programozó"),
        new Beosztas(2,"HR"),
        new Beosztas(3, "Rendszergazda"),
        new Beosztas(4, "Titkár"),
        new Beosztas(5, "Igazgató"),
        new Beosztas(6, "Bufés"),
        new Beosztas(7, "Takarító"),
        new Beosztas(8, "Asztalos"),
        new Beosztas(9, "Karbantartó"),
        new Beosztas(10, "Horgás")
    };
public Vector<Beosztas>beosztasList = new Vector<>(Arrays.asList(beosztasArray));

    Dolgozok[] dolgozokArray = {

        new Dolgozok(1, "Nyomo Réka", 1),
        new Dolgozok(2, "Para Zita", 4),
        new Dolgozok(3, "Patta Nóra", 6),
        new Dolgozok(4, "Pár Zoltán", 3),
        new Dolgozok(5, "Pop Simon", 1),
        new Dolgozok(6, "Remek Elek", 2),
        new Dolgozok(7, "Beviz Elek", 3),
        new Dolgozok(8, "Szalmon Ella", 7),
        new Dolgozok(9, "Techno Kolos", 9),
        new Dolgozok(10, "Trab Antal",6),
        new Dolgozok(11, "Ultra Viola", 6),
        new Dolgozok(12, "Am Erika", 7),
        new Dolgozok(13, "Bac Ilus", 4),
        new Dolgozok(14, "Citad Ella", 3),
        new Dolgozok(15, "Dil Emma", 2),
        new Dolgozok(16, "Eszte Lenke", 10),
        new Dolgozok(17, "Feles Elek", 9),
        new Dolgozok(18, "Füty Imre", 4),
        new Dolgozok(19, "Git Áron", 5),
        new Dolgozok(20, "Har Mónika", 5),
        new Dolgozok(21, "Zsíros B. Ödön", 7),
        new Dolgozok(22, "Külö Nóra", 8),
        new Dolgozok(23, "Kér Ede", 4),
        new Dolgozok(24, "Vég Béla", 2),
        new Dolgozok(25, "Wincs Eszter", 3),
        new Dolgozok(26, "Kasza Blanka", 10),
        new Dolgozok(27, "Tank Aranka", 10),
        new Dolgozok(28, "Tüdő R. Ákos", 1),

    };
    public Vector<Dolgozok>dolgozokList = new Vector<>(Arrays.asList(dolgozokArray));
}
