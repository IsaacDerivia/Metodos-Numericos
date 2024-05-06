package MetodoDeLaReglaFalsa;

import javax.swing.*;

public class panel extends JPanel{
      //declaracion de variables
        private javax.swing.JTextField x6;
        private javax.swing.JTextField x5;
        private javax.swing.JTextField x4;
        private javax.swing.JTextField x3;
        private javax.swing.JTextField x2;
        private javax.swing.JTextField x;
        private javax.swing.JTextField c;
        private javax.swing.JTextField a;
        private javax.swing.JTextField b;
        private javax.swing.JTextField error;






        //se crea el panel

        public panel(){

            //se crea el panel
            setLayout(null);
            setBackground(new java.awt.Color(255, 255, 255));
            //se crea el label
            javax.swing.JLabel label = new javax.swing.JLabel();
            label.setText("Metodo de la Regla Falsa");
            label.setBounds(300, 10, 200, 30);
            add(label);


            //se crea los labels de los campos, de x⁶ a constante
            javax.swing.JLabel label1 = new javax.swing.JLabel();
            label1.setText("x⁶");
            label1.setBounds(50, 50, 50, 30);
            add(label1);

            javax.swing.JLabel label2 = new javax.swing.JLabel();
            label2.setText("x⁵");
            label2.setBounds(50, 100, 50, 30);
            add(label2);

            javax.swing.JLabel label3 = new javax.swing.JLabel();
            label3.setText("x⁴");
            label3.setBounds(50, 150, 50, 30);
            add(label3);

            javax.swing.JLabel label4 = new javax.swing.JLabel();
            label4.setText("x³");
            label4.setBounds(50, 200, 50, 30);
            add(label4);

            javax.swing.JLabel label5 = new javax.swing.JLabel();
            label5.setText("x²");
            label5.setBounds(50, 250, 50, 30);
            add(label5);

            javax.swing.JLabel label6 = new javax.swing.JLabel();
            label6.setText("x");
            label6.setBounds(50, 300, 50, 30);
            add(label6);

            javax.swing.JLabel label7 = new javax.swing.JLabel();
            label7.setText("constante");
            label7.setBounds(50, 350, 100, 30);
            add(label7);

            //se crea los campos de texto de x⁶ a constante
            x6 = new javax.swing.JTextField();
            x6.setBounds(100, 50, 50, 30);
            add(x6);

            x5 = new javax.swing.JTextField();
            x5.setBounds(100, 100, 50, 30);
            add(x5);

            x4 = new javax.swing.JTextField();
            x4.setBounds(100, 150, 50, 30);
            add(x4);

            x3 = new javax.swing.JTextField();
            x3.setBounds(100, 200, 50, 30);
            add(x3);

            x2 = new javax.swing.JTextField();
            x2.setBounds(100, 250, 50, 30);
            add(x2);

            x = new javax.swing.JTextField();
            x.setBounds(100, 300, 50, 30);
            add(x);

            c = new javax.swing.JTextField();
            c.setBounds(150, 350, 50, 30);
            add(c);

            //se crea los labels de los campos de a y b
            javax.swing.JLabel label8 = new javax.swing.JLabel();
            label8.setText("a");
            label8.setBounds(50, 400, 50, 30);

            add(label8);

            javax.swing.JLabel label9 = new javax.swing.JLabel();
            label9.setText("b");

            label9.setBounds(50, 450, 50, 30);
            add(label9);

            //se crea los campos de texto de a y b
            a = new javax.swing.JTextField();
            a.setBounds(100, 400, 50, 30);
            add(a);

            b = new javax.swing.JTextField();
            b.setBounds(100, 450, 50, 30);
            add(b);

            //se crea el label de error
            javax.swing.JLabel label10 = new javax.swing.JLabel();
            label10.setText("Error");
            label10.setBounds(50, 500, 50, 30);

            add(label10);

            //se crea el campo de texto de error
            error = new javax.swing.JTextField();
            error.setBounds(100, 500, 50, 30);
            add(error);

            //se crea el boton de calcular
            javax.swing.JButton boton = new javax.swing.JButton();
            boton.setText("Calcular");
            boton.setBounds(200, 500, 100, 30);
            add(boton);

            //se crea el boton de limpiar
            javax.swing.JButton limpiar = new javax.swing.JButton();
            limpiar.setText("Limpiar");
            limpiar.setBounds(350, 500, 100, 30);
            add(limpiar);



            //btn limpiar
            limpiar.addActionListener(new java.awt.event.ActionListener(){
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    limpiar();
                }
            });





        }

    public JTextField getX6() {
        return x6;
    }

    public void setX6(JTextField x6) {
        this.x6 = x6;
    }

    public JTextField getX5() {
        return x5;
    }

    public void setX5(JTextField x5) {
        this.x5 = x5;
    }

    public JTextField getX4() {
        return x4;
    }

    public void setX4(JTextField x4) {
        this.x4 = x4;
    }

    public JTextField getX3() {
        return x3;
    }

    public void setX3(JTextField x3) {
        this.x3 = x3;
    }

    public JTextField getX2() {
        return x2;
    }

    public void setX2(JTextField x2) {
        this.x2 = x2;
    }

    public JTextField getXField() {
        return x;
    }

    public void setX(JTextField x) {
        this.x = x;
    }

    public JTextField getC() {
        return c;
    }

    public void setC(JTextField c) {
        this.c = c;
    }

    public JTextField getA() {
        return a;
    }

    public void setA(JTextField a) {
        this.a = a;
    }

    public JTextField getB() {
        return b;
    }

    public void setB(JTextField b) {
        this.b = b;
    }

    public JTextField getError() {
        return error;
    }

    public void setError(JTextField error) {
        this.error = error;
    }


    //validar
    public boolean validar(){

            //los campos que no se llenen se vuelven cero

        if(x6.getText().equals("")){
            x6.setText("0");

        }
        if(x5.getText().equals("")){
            x5.setText("0");

        }

        if(x4.getText().equals("")){
            x4.setText("0");

        }

        if(x3.getText().equals("")){
            x3.setText("0");

        }

        if(x2.getText().equals("")){
            x2.setText("0");

        }

        if(x.getText().equals("")){
            x.setText("0");

        }

        if(c.getText().equals("")){
            c.setText("0");

        }



        //se valida que los campos sean numericos
        try{
            Double.parseDouble(x6.getText());
            Double.parseDouble(x5.getText());
            Double.parseDouble(x4.getText());
            Double.parseDouble(x3.getText());
            Double.parseDouble(x2.getText());
            Double.parseDouble(x.getText());
            Double.parseDouble(c.getText());
            Double.parseDouble(a.getText());
            Double.parseDouble(b.getText());
            Double.parseDouble(error.getText());
        }catch(NumberFormatException e){
            return false;

        }



        return true;
    }

    //metodo de la regla falsa



    //limpiar

    public void limpiar(){
        x6.setText("");
        x5.setText("");
        x4.setText("");
        x3.setText("");
        x2.setText("");
        x.setText("");
        c.setText("");
        a.setText("");
        b.setText("");
        error.setText("");
    }





}





        



