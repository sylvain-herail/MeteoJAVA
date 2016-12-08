package meteo;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syherail
 */
public abstract class Fenetre implements Observer, Initializable{
    
    Capteur capteur;
    
    public Fenetre(Capteur capteur){
        this.capteur=capteur;
    }
    
    public abstract void update(Observable obj,Object o);

    @Override
    public abstract void initialize(URL location, ResourceBundle resources);
    
}
