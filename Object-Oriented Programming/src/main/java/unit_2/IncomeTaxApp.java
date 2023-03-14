package unit_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncomeTaxApp extends JFrame {
    private JTextField nameField, cpfField, ufField, salaryField;
    private JLabel resultLabel;

    public IncomeTaxApp() {
        setTitle("Calculadora de Imposto de Renda");
        setSize(800, 450);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screen.width - getWidth()) / 2, (screen.height - getHeight()) / 2);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;

        panel.add(new JLabel("Nome Completo:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        nameField = new JTextField(20);
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        panel.add(new JLabel("Número CPF:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        cpfField = new JTextField(20);
        panel.add(cpfField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        panel.add(new JLabel("Estado (UF):"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        ufField = new JTextField(20);
        panel.add(ufField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.NONE;
        panel.add(new JLabel("Salário Anual:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        salaryField = new JTextField(20);
        panel.add(salaryField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        JButton calcButton = new JButton("Calcular Imposto");
        panel.add(calcButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        resultLabel = new JLabel();
        panel.add(resultLabel, gbc);

        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] values = { nameField.getText(), cpfField.getText(), ufField.getText(), salaryField.getText() };
                for (String value : values) {
                    if (value.trim().equals("")) {
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                        return;
                    }
                }
                IncomeTax tax = new IncomeTax(values[0], values[1], values[2], Double.parseDouble(values[3]));
                JOptionPane.showMessageDialog(null, tax.toString());
            }
        });
        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        IncomeTaxApp taxGUI = new IncomeTaxApp();
        taxGUI.setVisible(true);
    }
}


