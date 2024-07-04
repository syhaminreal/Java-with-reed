import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[][] buttons = new JButton[3][3];
    private boolean xTurn = true;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 40));
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (clickedButton.getText().equals("")) {
            if (xTurn) {
                clickedButton.setText("X");
            } else {
                clickedButton.setText("O");
            }
            xTurn = !xTurn;

            if (checkForWin()) {
                JOptionPane.showMessageDialog(this, (xTurn ? "O" : "X") + " wins!");
                resetGame();
            } else if (isBoardFull()) {
                JOptionPane.showMessageDialog(this, "It's a draw!");
                resetGame();
            }
        }
    }

    private boolean checkForWin() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (checkThree(buttons[i][0], buttons[i][1], buttons[i][2]) ||
                checkThree(buttons[0][i], buttons[1][i], buttons[2][i])) {
                return true;
            }
        }
        return checkThree(buttons[0][0], buttons[1][1], buttons[2][2]) ||
               checkThree(buttons[0][2], buttons[1][1], buttons[2][0]);
    }

    private boolean checkThree(JButton b1, JButton b2, JButton b3) {
        return !b1.getText().equals("") &&
               b1.getText().equals(b2.getText()) &&
               b2.getText().equals(b3.getText());
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (buttons[i][j].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        xTurn = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TicTacToe());
    }
} 