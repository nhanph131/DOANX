package pack_view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import enum_pack.enums.mode;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class login_frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel form_panel;
	private JTextField user_input;
	
	private JLabel header_lbl;
	
	private JPanel conf_panel;
	
	
	public JButton login_signup_btn;
	public JButton not_login_signup_btn_1;
	public JButton show_conf_pass_btn;
	public JButton show_pass_btn;
	public JPasswordField conf_pass_input;
	public JPasswordField password_input;
	
	public mode mode;
	
	
	public mode getMode() {
		return mode;
	}
	
	public void setMode(mode mode) {			//đặt chế độ
		this.mode = mode;
		if (mode == mode.login) {
			login_mode();
		}
		else signup_mode();
	}
	
	
	public void login_mode() {		//chế độ login
		setTitle("Login");
		this.mode = mode.login;
		header_lbl.setText("Login");
		conf_pass_input.setText("");
		password_input.setText("");
		user_input.setText("");
		login_signup_btn.setText("Login");
		not_login_signup_btn_1.setText("Or Sign Up");
		conf_panel.setEnabled(false);
		conf_panel.setVisible(false);	
	}
	public void signup_mode() {					//chế độ sign up
		setTitle("Sign Up");
		this.mode = mode.signup;
		conf_pass_input.setText("");
		password_input.setText("");
		user_input.setText("");
		header_lbl.setText("Sign Up");
		login_signup_btn.setText("Sign Up");
		not_login_signup_btn_1.setText("Or Login");
		conf_panel.setEnabled(true);
		conf_panel.setVisible(true);
	}
	
	private void addFocusHighlight(Component component, FocusListener f) {		//highlight focus
        if (component instanceof JTextField || component instanceof JPasswordField)
            ((JTextField) component).addFocusListener(f);;
        if (component instanceof Container) {
            Component[] components = ((Container) component).getComponents();
            for (Component child : components) {
                addFocusHighlight(child, f);
            }
        }
	}
	
	public login_frame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(login_frame.class.getResource("/image_pack/furina_icon_3.JPG")));
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 300, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 784, 461);
		contentPane.add(layeredPane);
		
		header_lbl = new JLabel();
		layeredPane.setLayer(header_lbl, 1);
		header_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		header_lbl.setForeground(new Color(0, 255, 255));
		header_lbl.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
		header_lbl.setBounds(299, 0, 186, 71);
		layeredPane.add(header_lbl);
		
		JLabel background_lbl = new JLabel();
		background_lbl.setIcon(new ImageIcon(login_frame.class.getResource("/image_pack/blur_furina_2.jpg")));
		background_lbl.setBounds(0, 0, 784, 461);
		layeredPane.add(background_lbl);
		
		form_panel = new JPanel();
		form_panel.setForeground(new Color(0, 0, 0));
		form_panel.setBorder(new LineBorder(new Color(128, 255, 255), 3, true));
		layeredPane.setLayer(form_panel, 1);
		form_panel.setBounds(148, 70, 500, 358);
		layeredPane.add(form_panel);
		form_panel.setLayout(null);
		form_panel.setOpaque(false);
		
		JLabel user_label = new JLabel("User name:");
		user_label.setForeground(new Color(128, 255, 255));
		user_label.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		user_label.setBounds(44, 30, 101, 22);
		form_panel.add(user_label);
		
		JLabel password_label = new JLabel("Password:");
		password_label.setHorizontalAlignment(SwingConstants.LEFT);
		password_label.setForeground(new Color(128, 255, 255));
		password_label.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		password_label.setBounds(44, 110, 101, 22);
		form_panel.add(password_label);
		
		user_input = new JTextField();
		user_input.setBorder(new LineBorder(new Color(128, 255, 255)));
		user_input.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		user_input.setForeground(new Color(128, 255, 255));
		user_input.setBounds(44, 52, 412, 44);
		form_panel.add(user_input);
		user_input.setColumns(10);
		user_input.setOpaque(false);
		
		password_input = new JPasswordField();
		password_input.setBorder(new LineBorder(new Color(128, 255, 255)));
		password_input.setForeground(new Color(128, 255, 255));
		password_input.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		password_input.setColumns(10);
		password_input.setBounds(44, 132, 412, 44);
		password_input.setEchoChar('*');
		form_panel.add(password_input);
		password_input.setOpaque(false);
		
		login_signup_btn = new JButton("Sign up");
		login_signup_btn.setBackground(new Color(0, 128, 255));
		login_signup_btn.setOpaque(false);
		login_signup_btn.setForeground(new Color(128, 255, 255));
		login_signup_btn.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		login_signup_btn.setBounds(46, 297, 127, 38);
		form_panel.add(login_signup_btn);
		
		show_pass_btn = new JButton("Show password");
		show_pass_btn.setOpaque(false);
		show_pass_btn.setForeground(new Color(128, 255, 255));
		show_pass_btn.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		show_pass_btn.setBounds(329, 179, 127, 25);
		show_pass_btn.setBackground(new Color(0, 128, 255));
		form_panel.add(show_pass_btn);
		
		not_login_signup_btn_1 = new JButton();
		not_login_signup_btn_1.setOpaque(false);
		not_login_signup_btn_1.setForeground(new Color(128, 255, 255));
		not_login_signup_btn_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		not_login_signup_btn_1.setBackground(new Color(0, 128, 255));
		not_login_signup_btn_1.setBounds(275, 305, 181, 31);
		form_panel.add(not_login_signup_btn_1);
		
		conf_panel = new JPanel();
		conf_panel.setBounds(10, 200, 480, 94);
		form_panel.add(conf_panel);
		conf_panel.setLayout(null);
		conf_panel.setOpaque(false);
		
		conf_pass_input = new JPasswordField();
		conf_pass_input.setBorder(new LineBorder(new Color(128, 255, 255)));
		conf_pass_input.setEchoChar('*');
		conf_pass_input.setForeground(new Color(128, 255, 255));
		conf_pass_input.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		conf_pass_input.setColumns(10);
		conf_pass_input.setBounds(34, 22, 412, 44);
		conf_pass_input.setOpaque(false);
		conf_panel.add(conf_pass_input);
		
		show_conf_pass_btn = new JButton("Show password");
		show_conf_pass_btn.setOpaque(false);
		show_conf_pass_btn.setForeground(new Color(128, 255, 255));
		show_conf_pass_btn.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		show_conf_pass_btn.setBackground(new Color(0, 128, 255));
		show_conf_pass_btn.setBounds(319, 69, 127, 25);
		conf_panel.add(show_conf_pass_btn);
		
		JLabel conf_pass_label = new JLabel("Confirm Password:");
		conf_pass_label.setHorizontalAlignment(SwingConstants.LEFT);
		conf_pass_label.setForeground(new Color(128, 255, 255));
		conf_pass_label.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		conf_pass_label.setBounds(33, 0, 164, 22);
		conf_panel.add(conf_pass_label);
		
		FocusListener focusListener = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                JTextField textField = (JTextField) e.getComponent();
                textField.setBorder(new LineBorder(Color.CYAN, 4));
            }

            @Override
            public void focusLost(FocusEvent e) {
                JTextField textField = (JTextField) e.getComponent();
                textField.setBorder(new LineBorder(textField.getForeground()));
            }
        };
		addFocusHighlight(contentPane, focusListener);
	}
}
