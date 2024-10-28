package com.example.interfacciagrafica;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    private Giocatore [] giocatori=new Giocatore[10];
    @FXML
    private Button Aggiungi;
    @FXML
    private Button Visualizza;
    @FXML
    private Button Modifica;
    @FXML
    private Button Cancella;
    @FXML
    private Button Ngol;
    @FXML
    private Button Capitano;
    @FXML
    private TextField Nome;
    @FXML
    private TextField NumGol;
    @FXML
    private CheckBox IsCapitano;

    @FXML
    private TextArea Output;
    @FXML
    protected void Stampa()
    {
        Output.setText(Lettura(giocatori));
    }
    @FXML
    protected void Aggiunta()
    {
        Aggiungi(Nome.getText(),IsCapitano.isSelected(),Integer.parseInt(NumGol.getText()), giocatori);
    }
    public static String Lettura(Giocatore [] giocatori)
    {
        String Statistiche="";
        for (int i=0;i< giocatori.length;i++)
        {
            Statistiche=Statistiche + giocatori[i].getNome() + ", " + giocatori[i].getCapitano() + ", " + giocatori[i].getGol() +"\n";
        }
        return Statistiche;
    }
    public static void Aggiungi(String Nome, boolean ISCapitano, int Gol, Giocatore [] giocatori)
    {
        for (int i=0;i< giocatori.length;i++)
        {
           giocatori[i]=new Giocatore(Nome, ISCapitano, Gol);
        }
    }
}