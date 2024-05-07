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


            //se obtienen los valores de los campos
            double x6 = obtenerValor(txtField);
            double x5 = obtenerValor(txtField1);
            double x4 = obtenerValor(txtField2);
            double x3 = obtenerValor(txtField3);
            double x2 = obtenerValor(txtField4);
            double x = obtenerValor(txtField5);
            double c = obtenerValor(txtField6);
            double a = Double.parseDouble(txtField7.getText());
            double b = Double.parseDouble(txtField8.getText());
            double error = Double.parseDouble(txtField9.getText());
            int decimales = Integer.parseInt(txtField10.getText());

            //se crea la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Iteración");
            modelo.addColumn("raiz");
            modelo.addColumn("error");
            JTable tabla = new JTable(modelo);
            JScrollPane scroll = new JScrollPane(tabla);
            scroll.setBounds(400, 357, 800, 400);
            add(scroll);

            //se crean las variables
            double fa = evaluarFuncion(x6, x5, x4, x3, x2, x, c, a);
            double fb = evaluarFuncion(x6, x5, x4, x3, x2, x, c, b);

            //se valida que haya una raiz
            if (fa * fb > 0) {
                JOptionPane.showMessageDialog(null, "No hay raíz en el intervalo", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //se crea la variable para la raiz
            double xr = 0;

            //se crea la variable para el error
            double errorCalculado = 0;

            //se crea la variable para la iteracion
            int i = 0;

            //ciclo para calcular la raiz
            do {
                //se calcula la raiz
                xr = b - (fb * (b - a)) / (fb - fa);
                System.out.println("xr: " + xr);
                double fxr = evaluarFuncion(x6, x5, x4, x3, x2, x, c, xr);

                //se calcula el error
                errorCalculado = Math.abs((xr - a )/ xr)*100;

                //se valida si la raiz es la raiz
                if (fa * fxr < 0) {
                    b = xr;
                    fb = fxr;
                } else if (fa * fxr > 0) {
                    a = xr;
                    fa = fxr;
                } else {
                    //se terminar el ciclo si fa* fxr = 0
                    break;

                }

                modelo.addRow(new Object[]{i, redondear(xr, decimales), errorCalculado});
                i++;
            } while (errorCalculado > error);




            







        });

        btnLimpiar.addActionListener(e -> {
            // Código para el botón Limpiar
        });





    }

    public static double obtenerValor(JTextField campo) {
        String texto = campo.getText();
        return texto.isEmpty() ? 0.0 : Double.parseDouble(texto);
    }

    //metodo para validar si es un numero y no un caracter
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











        



