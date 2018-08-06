import javax.swing.*;

public class EvenEntryLoop
{
    public static void main(String[] args)
    {
        final int SENTINEL = 999;
        int num;
        String inputString;

        inputString = JOptionPane.showInputDialog(null, "Type an even number or 999 to stop: ");
        num = Integer.parseInt(inputString);

        while (num != SENTINEL)
        {
            if (num % 2 == 0)
                JOptionPane.showMessageDialog(null, "Good job!");
            else
                JOptionPane.showMessageDialog(null, "The input number is an odd number." +
                        "\nPlease input another number.");
            inputString = JOptionPane.showInputDialog(null, "Type an even number or 999 to stop: ");
            num = Integer.parseInt(inputString);
        }
        JOptionPane.showMessageDialog(null, "Thank you for using this application.");
    }
}
