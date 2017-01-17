import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Maxie on 2017-01-17.
 */
public class ControllerMineSweeper {

    private ExitListener exit = new ExitListener();

    public ControllerMineSweeper() {
        ModelGameBoard modelBoard = new ModelGameBoard(2);
        ModelMineSweeper modelSweeper = new ModelMineSweeper();
        ViewMineSweeper viewSweeper = new ViewMineSweeper();

        viewSweeper.getExitOption().addActionListener(exit);
    }

    private static class ExitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int confirmExit = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to exit?", null, JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE);
            if (confirmExit == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new ControllerMineSweeper();
    }
}
