import javax.swing.*;

public class ciclo {
    public static void main(String[] args) {
        String[] equipos = {"ateltico naciona"," millonarios","tolima","america","cali","bogota","medellin","cucuta","once caldas"};

        for (String i : equipos) {
            JOptionPane.showMessageDialog(null, "equipo  " + "\n" + i);
        }
    }
}
