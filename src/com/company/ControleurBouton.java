package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleurBouton extends JPanel implements ActionListener {
/*
    Mettre la virgule à la place du = et mettre ce dernier sur toute la largeur de la fenêtre
 */
    String[] tab_string = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "x", "C/CE", "0", "=", "/"};
    JButton[] tab_button = new JButton[tab_string.length];
    private Controleur controleur;


    public ControleurBouton(Controleur controleur){
        this.controleur=controleur;
        this.setLayout(new GridLayout(4,4));
        setPreferredSize(new Dimension(250,250));

        for(int i = 0; i < tab_string.length; i++){
            tab_button[i] = new JButton(tab_string[i]);
            tab_button[i].setPreferredSize(new Dimension(60,60));
            add(tab_button[i]);
            tab_button[i].addActionListener(this);
            switch (i){
                case 3:
                    tab_button[i].setBorder(new LineBorder(Color.red,1));
                case 7:
                    tab_button[i].setBorder(new LineBorder(Color.red,1));
                case 11:
                    tab_button[i].setBorder(new LineBorder(Color.red,1));
                case 12:
                    tab_button[i].setBorder(new LineBorder(Color.red,1));
                case 14:
                    tab_button[i].setBorder(new LineBorder(Color.red,1));
                case 15:
                    tab_button[i].setBorder(new LineBorder(Color.red,1));
                    break;
                default:
                    tab_button[i].setBorder(new LineBorder(Color.blue,1));
                    break;
            }
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String str = ((JButton)e.getSource()).getText();
        switch (str){
            case "+":
                controleur.plus();
                break;
            case "-":
                controleur.moins();
                break;
            case "x":
                controleur.multiplier();
                break;
            case "/":
                controleur.diviser();
                break;
            case "=":
                controleur.egal();
                break;
            case "C/CE":
                controleur.raz();
                break;
            default:
                controleur.setChiffre(str);
        }

    }
}
