import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame("My first Swing app");

            window.setSize(400, 300);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton button = new JButton("Click me!");

            button.addActionListener(event -> {
                button.setText("You clicked me!");
            });

            window.add(button);
            window.setLocationRelativeTo(null);
            window.setVisible(true);
        });
    }
}