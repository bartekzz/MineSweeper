import javax.swing.*;
import java.awt.*;

/**
 * Created by Maxie on 2017-01-17.
 */
public class ViewMineSweeper extends JFrame {

    private JPanel panel;

    private JMenuBar menuBar;
    private JMenuItem exitOption;
    private JMenuItem newGameOption;

    public ViewMineSweeper() {
        createMenu();
        createWindow();
    }

    private void createWindow() {
        panel = new JPanel();
        panel.setLayout(new GridLayout());
        panel.setOpaque(true);
        panel.setBackground(Color.DARK_GRAY);

        //window settings
        JFrame frame = new JFrame("Minesweeper");
        frame.add(panel);
        frame.setPreferredSize(new Dimension(1280, 720));
        frame.setLocationRelativeTo(null); //center window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.setJMenuBar(menuBar);
    }

    private void createMenu() {
        menuBar = new JMenuBar();

        JMenu systemMenu = new JMenu("System"); //create menubar titled system
        menuBar.add(systemMenu);
        setJMenuBar(menuBar);

        newGameOption = new JMenuItem("New game");
        newGameOption.setToolTipText("Starts a new game");
        systemMenu.add(newGameOption);

        exitOption = new JMenuItem("Exit");
        exitOption.setToolTipText("Exit application");
        systemMenu.add(exitOption);
    }

    private void createButtons() {

    }

    public JMenuItem getExitOption() {
        return this.exitOption;
    }


}
