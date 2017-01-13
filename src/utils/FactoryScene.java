/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import capteurs.Capteur;
import controller.IconeWinController;
import controller.ThermostatWinController;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

/**
 *
 * @author sabussy
 */
public class FactoryScene {

    private static final String SPINNER = "Spinner";
    private static final String ICONE = "Icone";
    private FXMLLoader load;
    
    public Scene creerFenetre(Capteur capteur, String nomFenetre) throws IOException, Exception {
        switch(nomFenetre){
            case SPINNER :
                load = new FXMLLoader(getClass().getResource("/gui/ThermostatWin.fxml"));
                load.setController(new ThermostatWinController(capteur));
                break;
            case ICONE :
                load = new FXMLLoader(getClass().getResource("/gui/IconeWin.fxml"));
                load.setController(new IconeWinController(capteur));
                break;
            default :
                System.err.println("pb choix fenetre");
                load = new FXMLLoader();
                break;
        }
        return new Scene(load.load());
    }
    
}
