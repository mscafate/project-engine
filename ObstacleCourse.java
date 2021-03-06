/**
 * File: ObstacleCourse.java
 * Author: Michael Scafate
 * Purpose: Obstacle course game.
 */
import javax.swing.*;
import java.awt.*;

/**
 * The Obstacles class is the main application frame.
 */
public class ObstacleCourse extends JFrame {
    //  Application Defaults
    public static String AppName = "Obstacles";
    public static final int APP_WIDTH = 800, APP_HEIGHT = 800;

    //  Game World
    public GameBoard gameBoard;

    //  Constructor
    public ObstacleCourse () {
        super(AppName);

        //  Setup the application display
        setSize(APP_WIDTH, APP_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  Default Layout
        this.setLayout(new BorderLayout());

        //  Game Panel to draw
        GameBoard gameBoard = new GameBoard();

        this.add(gameBoard, BorderLayout.CENTER);
        this.addKeyListener(gameBoard);

        //  Display the frame
        this.setVisible(true);
    }

    //  Main Entry Point.
    static public void main (String[] args) {
        new ObstacleCourse();
    }
}
