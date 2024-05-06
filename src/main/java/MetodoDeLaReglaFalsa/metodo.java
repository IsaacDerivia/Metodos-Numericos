package MetodoDeLaReglaFalsa;

import javax.swing.JFrame;


public class metodo extends JFrame{
    //se crea la ventana
    public metodo(){
        setTitle("Metodo de la Regla Falsa");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new panel());
    }



    public static void main(String[] args) {
        metodo m = new metodo();
        m.setVisible(true);
    }

}
