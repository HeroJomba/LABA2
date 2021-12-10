package bsu.rfe.java.group6.lab2.BYKOV.varA;




import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JRadioButton;


public class MainFrame extends JFrame {
    private ButtonGroup radioButtonsF = new ButtonGroup();
    private ButtonGroup radioButtonsM = new ButtonGroup();
    private JLabel labelImage;
    private Box hboxFormulaType = Box.createHorizontalBox();
    private Box hboxMemRB = Box.createHorizontalBox();
    private int formulaId = 1;
    private int memid;
    private Toolkit kit;


    public Double calculate1(Double x, Double y, Double z) {
        return (Math.pow(Math.cos(Math.PI*x*x*x)+Math.log((1+y)*(1+y)),0.25)*
                (Math.exp(Math.pow(z,2))+Math.pow((1*Math.pow(x,-1)),0.5)+Math.cos(Math.exp(y))));

    }

    public Double calculate2(Double x, Double y, Double z) {
        return ((Math.pow(x,x))/((Math.pow((y*y*y+1),0.5)+Math.log(z))));
    }
    private void addRadioButtonF(String buttonName, final int formulaId) {

        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                MainFrame.this.formulaId = formulaId;
                Image im;


                if (formulaId == 1)
                    im = kit.getImage("pictures/func1.png").getScaledInstance(600, 100, Image.SCALE_SMOOTH);
                else
                    im = kit.getImage("pictures/func2.png").getScaledInstance(600, 100, Image.SCALE_SMOOTH);


                ImageIcon i = new ImageIcon();
                i.setImage(im);
                labelImage.setIcon(i);
            }
        });
        radioButtonsF.add(button);
        hboxFormulaType.add(button);
    }

    private void addRadioButtonM(String buttonName, final int mid) {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                MainFrame.this.memid = mid - 1;
            }
        });
        radioButtonsM.add(button);
        hboxMemRB.add(button);
    }

}
