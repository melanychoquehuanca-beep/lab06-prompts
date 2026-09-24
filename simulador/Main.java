import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginForm extends JFrame {
    private JTextField txtCorreo;
    private JPasswordField txtContrasena;
    private JButton btnIngresar;

    public LoginForm() {
        setTitle("Sistema de Login");
        setSize(380, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("  Correo electrónico:"));
        txtCorreo = new JTextField();
        add(txtCorreo);

        add(new JLabel("  Contraseña:"));
        txtContrasena = new JPasswordField();
        add(txtContrasena);

        btnIngresar = new JButton("Ingresar");
        add(new JLabel()); 
        add(btnIngresar);

        // Evento de validación
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();
            }
        });
    }

    private void validarLogin() {
        String correo = txtCorreo.getText().trim();
        String contrasena = new String(txtContrasena.getPassword());

        if (!correo.contains("@")) {
            JOptionPane.showMessageDialog(this, 
                "El correo debe contener el carácter '@'.", 
                "Error de Validación", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (contrasena.length() < 8) {
            JOptionPane.showMessageDialog(this, 
                "La contraseña debe tener al menos 8 caracteres.", 
                "Error de Validación", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, 
            "¡Inicio de sesión exitoso!", 
            "Éxito", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}