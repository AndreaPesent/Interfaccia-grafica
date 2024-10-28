package com.example.interfacciagrafica;

public class Giocatore
{
    private String nome;
    private boolean capitano;
    private int gol;
    public Giocatore(String Nome, boolean Capitano, int Gol)
    {
       setNome(nome);
       setCapitano(capitano);
       setGol(gol);
    }
    public String getNome()
    {
        return nome;
    }
    public boolean getCapitano()
    {
        return capitano;
    }
    public int getGol()
    {
        return gol;
    }
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public void setCapitano(boolean capitano)
    {
        this.capitano=capitano;
    }
    public void setGol(int gol)
    {
        this.gol=gol;
        if (gol<0)
        {
            System.out.println("I gol non possono essere minori di 0");
        }
    }
}