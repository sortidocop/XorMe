import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DashBoard extends JFrame {

	private JTextField login;
	private JTextField password;
	private JButton bouton = new JButton("Xor");
	private JTextArea xorLogin;
	private JTextArea xorPwd;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DashBoard() {
		this.setSize(250, 200);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Xor Me");

		bouton.addActionListener(new XorProcess(this));

		this.login = new JTextField(10);
		this.password = new JTextField(10);
		this.xorLogin = new JTextArea();
		this.xorPwd = new JTextArea();
		
		xorLogin.setEditable(false);
		xorPwd.setEditable(false);

		this.setVisible(true);
		this.setLocationRelativeTo(null);

		JLabel labelLogin = new JLabel("Login: ");
		JLabel labelPass = new JLabel("PassWord: ");

		// On crée un conteneur avec gestion horizontale
		Box b1 = Box.createHorizontalBox();
		b1.add(labelLogin);
		b1.add(this.login);
		// Idem
		Box b2 = Box.createHorizontalBox();
		b2.add(labelPass);
		b2.add(this.password);
		// Idem
		Box b3 = Box.createHorizontalBox();
		b3.add(this.bouton);

		Box b4 = Box.createHorizontalBox();
		b4.add(this.xorLogin);
		Box b5 = Box.createHorizontalBox();
		b5.add(this.xorPwd);

		// On crée un conteneur avec gestion verticale
		Box b6 = Box.createVerticalBox();
		b6.add(b1);
		b6.add(b2);
		b6.add(b3);
		b6.add(b4);
		b6.add(b5);

		this.getContentPane().add(b6);

		// this.pack();
		this.setVisible(true);
	}

	public String loginText() {
		return this.login.getText();
	}

	public String passText() {
		return this.password.getText();
	}

	public void afficher(String login, String pwd) {
		this.xorLogin.setText(login);
		this.xorPwd.setText(pwd);
	}

}
