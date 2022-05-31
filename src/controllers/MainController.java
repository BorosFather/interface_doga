/*
* File: MainController.java
* Author: Boros Zoltán
* Copyright: 2022, Boros Zoltán
* Group: Szoft I N
* Date: 2022-05-31
* Github: https://github.com/BorosFather/
* Licenc: GNU GPL
*/

package controllers;


import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        setFrame();
        setEvent();
    }
    
    private void setFrame(){
        this.mainModel.beosztasList.forEach(beosztas -> {
            this.mainFrame.beosztasModel.addElement(beosztas.name);
        });
    }

    private void setEvent(){
        this.mainFrame.beosztasCombo.addActionListener(e -> Combo());

    }

    private void Combo(){
        int selected = this.mainFrame.beosztasCombo.getSelectedIndex();
        this.mainFrame.dolgozoModel.clear();

        this.mainModel.dolgozokList.forEach(dolgozok ->{
            if(dolgozok.beosztasId == selected){
                this.mainFrame.dolgozoModel.addElement(dolgozok.name);
            }
        });
    }
}
