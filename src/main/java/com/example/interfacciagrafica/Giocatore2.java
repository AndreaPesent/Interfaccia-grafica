package com.example.interfacciagrafica;

import java.util.Scanner;
public class Giocatore2
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner (System.in);
        int scelta=0;
        String Nome="";
        boolean ISCapitano;
        String Capitano="";
        int Gol=0;
        int Indice=0;
        Giocatore [] giocatori=new Giocatore[10];
        do
            {
                System.out.println("SCEGLI UNA DELLE SEGUENTI OPZIONI");
                System.out.println("1- Aggiunta giocatore alla squadra");
                System.out.println("2- Visualizzazione giocatori della squadra");
                System.out.println("3- Modifica dati giocatore");
                System.out.println("4- Cancellazione di un giocatore");
                System.out.println("5- Visualizzazione giocatori con più di 5 gol");
                System.out.println("6- Visualizzazione nome capitano");
                System.out.println("7- Assegnazione ruolo capitano in maniera casuale");
                scelta=in.nextInt();
                switch (scelta)
                {
                    case 1:
                            System.out.println("Inserisci il nome del giocatore");
                            Nome=in.next();
                            System.out.println("Il giocatore è capitano? - true/false");
                            ISCapitano=in.nextBoolean();
                            System.out.println("Inserisci il numero di gol del giocatore");
                            Gol=in.nextInt();
                            break;

                    case 2:
                        for (int i=0;i< giocatori.length;i++)
                        {
                            System.out.println(Lettura(giocatori));
                        }
                            break;

                    case 3:
                            System.out.println("Inserisci la satistica che vuoi cambiare");
                            break;

                    case 4:
                            System.out.println("Inserisci la posizione in cui si trova il giocatore");
                            Indice=in.nextInt();
                            break;

                    case 5:
                            System.out.println(NumeroGol(giocatori));
                            break;

                    case 6:
                            System.out.println(NomeCapitano(giocatori));
                            break;

                }
            } while (scelta!=8);
    }
    public static void Aggiungi(String Nome, boolean ISCapitano, int Gol, Giocatore [] giocatori)
    {
        for (int i=0;i< giocatori.length;i++)
        {
            giocatori[i].setNome(Nome);
            giocatori[i].setCapitano(ISCapitano);
            giocatori[i].setGol(Gol);
        }
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
    public static void Modifica(String Nome, int Gol, Giocatore[]giocatori, boolean ISCapitano)
    {

    }
    public  static void CancellaGiocatore(Giocatore[]giocatori, int Indice)
    {
        for (int i=0;i< giocatori.length;i++)
        {
            if(i==Indice)
            {
                giocatori[i]=null;
            }
        }
    }
    public static String NumeroGol (Giocatore[]giocatori)
    {
        int Ngol=0;
        String NomeGiocatore="";
        for (int i=0;i<giocatori.length;i++)
        {
            Ngol=giocatori[i].getGol();
            if (Ngol>5)
            {
                NomeGiocatore=giocatori[i].getNome();
            }
        }
        return NomeGiocatore;
    }
    public static String NomeCapitano(Giocatore[]giocatori)
    {
        String NomeCapitano="";
        boolean IsCapitano;
        for (int i=0;i<giocatori.length;i++)
        {
            IsCapitano=giocatori[i].getCapitano();
            if (IsCapitano==true)
            {
                NomeCapitano=giocatori[i].getNome();
            }
        }
        return NomeCapitano;
    }
}