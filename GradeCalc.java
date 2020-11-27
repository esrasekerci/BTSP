//1. Collect values
//2. Apply formula { assg*0.2 + midterm*0.3 + finalexam*0.5}
//3. Display result
package gradecalc;

import javax.swing.JOptionPane;

public class GradeCalc {

    public static void main(String[] args) {
        String assignment1str
                = JOptionPane.showInputDialog("Enter the first assignment: ");
        String assignment2str
                = JOptionPane.showInputDialog("Enter the second assignment: ");
        String midtermstr
                = JOptionPane.showInputDialog("Enter the midterm: ");
        String finalexamstr
                = JOptionPane.showInputDialog("Enter the final: ");
        double assignment1 = Double.parseDouble(assignment1str);
        double assignment2 = Double.parseDouble(assignment2str);
        double midterm = Double.parseDouble(midtermstr);
        double finalexam = Double.parseDouble(finalexamstr);
        double sum = ((assignment1 + assignment2) / 2) * 0.2 + midterm * 0.3 + finalexam * 0.5;
        JOptionPane.showMessageDialog(null, "Total grade: " + sum);
    }

}
