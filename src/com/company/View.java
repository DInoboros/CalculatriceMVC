package com.company;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class View extends JPanel {

	private JLabel value;

	public View(){
		this.setPreferredSize(new Dimension(220, 30));
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		value=new JLabel();
		Font police = new Font("Arial", Font.BOLD, 20);
		value.setFont(police);
		value.setText("0");
        value.setForeground(Color.green);
        this.setBackground(Color.black);
		value.setHorizontalAlignment(JLabel.LEFT);
		value.setPreferredSize(new Dimension(220, 20));
		this.add(value);
	}

	public void setValue(String value){
		this.value.setText(value);
	}
}
