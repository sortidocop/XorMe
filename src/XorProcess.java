import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XorProcess implements ActionListener {

	private DashBoard dash;

	public XorProcess(DashBoard dash) {
		this.dash = dash;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		final String login = dash.loginText();
		final String password = dash.passText();

		dash.afficher(XorUtils.encryption(login), XorUtils.encryption(password));

	}

}
