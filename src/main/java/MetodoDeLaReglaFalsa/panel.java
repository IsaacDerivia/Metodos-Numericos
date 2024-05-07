package MetodoDeLaReglaFalsa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class panel extends JPanel {

    public panel() {
        setLayout(null);
        JLabel lblMetodosNumericos = new JLabel("Métodos Numéricos");
        lblMetodosNumericos.setBounds(21, 25, 227, 36);
        add(lblMetodosNumericos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(702, 26, 90, 36);
        btnCalcular.setBackground(new Color(255, 138, 132)); // Establece el color de fondo a #FF8A84
        btnCalcular.setBorderPainted(false); // Desactiva el dibujo del borde del botón
        add(btnCalcular);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(883, 26, 90, 36);
        btnLimpiar.setBackground(new Color(255, 138, 132)); // Establece el color de fondo a #FF8A84
        btnLimpiar.setBorderPainted(false); // Desactiva el dibujo del borde del botón
        add(btnLimpiar);

        JLabel lblX6 = new JLabel("x⁶");
        lblX6.setBounds(41, 160, 24, 36);
        add(lblX6);

        JTextField txtField = new JTextField();
        txtField.setBounds(41, 221, 100, 50);
        add(txtField);

        JLabel lblX5 = new JLabel("x⁵");
        lblX5.setBounds(191, 160, 24, 36);
        add(lblX5);

        JTextField txtField1 = new JTextField();
        txtField1.setBounds(191, 221, 100, 50);
        add(txtField1);


        JLabel lblX4 = new JLabel("x⁴");
        lblX4.setBounds(338, 160, 24, 36);
        add(lblX4);


        JTextField txtField2 = new JTextField();
        txtField2.setBounds(338, 221, 100, 50);
        add(txtField2);


        JLabel lblX3 = new JLabel("x³");
        lblX3.setBounds(488, 160, 24, 36);
        add(lblX3);

        JTextField txtField3 = new JTextField();
        txtField3.setBounds(488, 221, 100, 50);
        add(txtField3);


        JLabel lblX2 = new JLabel("x²");
        lblX2.setBounds(640, 160, 24, 36);
        add(lblX2);

        JTextField txtField4 = new JTextField();
        txtField4.setBounds(640, 221, 100, 50);
        add(txtField4);

        JLabel lblX = new JLabel("x");
        lblX.setBounds(790, 160, 24, 36);
        add(lblX);

        JTextField txtField5 = new JTextField();
        txtField5.setBounds(790, 221, 100, 50);
        add(txtField5);

        JLabel lblC = new JLabel("C");
        lblC.setBounds(940, 160, 24, 36);
        add(lblC);

        JTextField txtField6 = new JTextField();
        txtField6.setBounds(940, 221, 100, 50);
        add(txtField6);


        JLabel lblIntervalos = new JLabel("Intervalos");
        lblIntervalos.setBounds(40, 357, 113, 36);
        add(lblIntervalos);

        JLabel lblA = new JLabel("a");
        lblA.setBounds(40, 418, 24, 36);
        add(lblA);

        JTextField txtField7 = new JTextField();
        txtField7.setBounds(40, 479, 100, 50);
        add(txtField7);

        JLabel lblB = new JLabel("b");
        lblB.setBounds(191, 418, 24, 36);
        add(lblB);

        JTextField txtField8 = new JTextField();
        txtField8.setBounds(191, 479, 100, 50);
        add(txtField8);


        JLabel lblError = new JLabel("Error");
        lblError.setBounds(28, 593, 199, 50);
        add(lblError);

        JTextField txtField9 = new JTextField();
        txtField9.setBounds(28, 668, 100, 50);
        add(txtField9);

        JLabel lblErrorAceptado = new JLabel("decimales");
        lblErrorAceptado.setBounds(200, 593, 199, 50); // Ajusta la posición x
        add(lblErrorAceptado);

        JTextField txtField10 = new JTextField();
        txtField10.setBounds(200, 668, 100, 50); // Ajusta la posición x
        add(txtField10);


        // Añade un borde vacío con título "Método de la Regla Falsa"
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(255, 138, 132)), "Método de la Regla Falsa", 0, 0, new Font("Tahoma", Font.BOLD, 18), new Color(255, 138, 132)));




        //btncalcular y btnlimpiar
        btnCalcular.addActionListener(e -> {
            // Código para el botón Calcular
            double x6, x5, x4, x3, x2, x, c;

            if (esNumerico(txtField.getText())) {
                x6 = Double.parseDouble(txtField.getText());
            } else {
                x6 = 0;
            }

            if (esNumerico(txtField1.getText())) {
                x5 = Double.parseDouble(txtField1.getText());
            } else {
                x5 = 0;
            }

            if (esNumerico(txtField2.getText())) {
                x4 = Double.parseDouble(txtField2.getText());
            } else {
                x4 = 0;
            }

            if (esNumerico(txtField3.getText())) {
                x3 = Double.parseDouble(txtField3.getText());
            } else {
                x3 = 0;
            }

            if (esNumerico(txtField4.getText())) {
                x2 = Double.parseDouble(txtField4.getText());
            } else {
                x2 = 0;
            }

            if (esNumerico(txtField5.getText())) {
                x = Double.parseDouble(txtField5.getText());
            } else {
                x = 0;
            }

            if (esNumerico(txtField6.getText())) {
                c = Double.parseDouble(txtField6.getText());
            } else {
                c = 0;
            }




            //validar
            double a=0, b=0, error=0;
            int decimales = 0;
            if (esNumerico(txtField7.getText())) {
                a = Double.parseDouble(txtField7.getText());
            } else {
                //si no es numerico mensaje de error
                JOptionPane.showMessageDialog(null, "El valor de a no es un número", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (esNumerico(txtField8.getText())) {
                b = Double.parseDouble(txtField8.getText());
            } else {
                JOptionPane.showMessageDialog(null, "El valor de a no es un número", "Error", JOptionPane.ERROR_MESSAGE);

            }

            if (esNumerico(txtField9.getText())) {
                error = Double.parseDouble(txtField9.getText());
            } else {
                JOptionPane.showMessageDialog(null, "El valor de a no es un número", "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (esNumerico(txtField10.getText())) {
                decimales = Integer.parseInt(txtField10.getText());
            } else {
                JOptionPane.showMessageDialog(null, "El valor de a no es un número", "Error", JOptionPane.ERROR_MESSAGE);

            }



            double fa = evaluarFuncion(x6, x5, x4, x3, x2, x, c, a);
            double fb = evaluarFuncion(x6, x5, x4, x3, x2, x, c, b);

            double xr = 0;

            //se crea una tabla con 3 columnas {iteracion, raiz, error}
            String[] columnas = {"Iteración", "Raíz", "Error"};
            String[][] datos = new String[100][3];

            //se crea un modelo de tabla
            DefaultTableModel modelo = new DefaultTableModel(datos, columnas);

            //se crea la tabla
            JTable tabla = new JTable(modelo);

            //se crea un scroll
            JScrollPane scroll = new JScrollPane(tabla);
            scroll.setBounds(400, 300, 500, 300);
            add(scroll);

            //se crea un contador
            int i = 1;
            boolean salir = false;

            //se crea un ciclo
            while (!salir) {
                xr = b - (fb * (a - b)) / (fa - fb);
                double fxr = evaluarFuncion(x6, x5, x4, x3, x2, x, c, xr);

                double errorCalculado = Math.abs((xr - a) / xr);

                //se redondea el error
                errorCalculado = redondear(errorCalculado, decimales);

                //se agrega la iteracion, raiz y error a la tabla
                modelo.addRow(new String[]{String.valueOf(i), String.valueOf(xr), String.valueOf(errorCalculado)});

                //se evalua si el error es menor al error aceptado
                if (errorCalculado < error) {
                    salir = true;
                }

                //se evalua si el producto de fa y fxr es menor a 0
                if (fa * fxr < 0) {
                    b = xr;
                    fb = fxr;
                } else {
                    a = xr;
                    fa = fxr;
                }

                i++;
            }







        });

        btnLimpiar.addActionListener(e -> {
            // Código para el botón Limpiar
        });




    }

    //metodo para validar si es numerico
    public static boolean esNumerico(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(255, 138, 132)); // Establece el color a #FF8A84
        g.fillRect(0, 0, 1366, 87); // Dibuja un rectángulo relleno
    }



    //metodo para redondear
    public static double redondear(double numero, int decimales) {
        return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }

    //metodo para evaluar la funcion
    public static double evaluarFuncion(double x6, double x5, double x4, double x3, double x2, double x, double c, double x0) {

        return x6 * Math.pow(x0, 6) + x5 * Math.pow(x0, 5) + x4 * Math.pow(x0, 4) + x3 * Math.pow(x0, 3) + x2 * Math.pow(x0, 2) + x * x0 + c;
    }



}











        



