package pack_ctrl;

import java.awt.EventQueue;

import pack_view.*;

public class my_planner{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_frame frame = new login_frame();
					frame.login_mode();
					
					signup_login_ctrl signup_login_ctrl = new signup_login_ctrl();
					signup_login_ctrl.button_listen(frame);
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

