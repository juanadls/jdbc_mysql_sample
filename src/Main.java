import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

String username = JOptionPane.showInputDialog(null, "Enter DB Username");

JPasswordField pf = new JPasswordField();

int okcCxl = JOptionPane.showConfirmDialog(null, pf, "Enter db password", JOptionPane.OK_CANCEL_OPTION);

final char [] password = (okcCxl == JOptionPane.OK_OPTION)? pf.getPassword() : null;



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    }
}