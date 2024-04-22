package pack_ctrl;

import pack_view.login_frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import enum_pack.enums.*;

public class signup_login_ctrl {
	
	public void button_listen(login_frame lgFrame) {
		
		lgFrame.not_login_signup_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch_mode(lgFrame);
			}
		});
		
		lgFrame.show_conf_pass_btn.addActionListener(new ActionListener() {
            boolean showPassword = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                showPassword = !showPassword;
                if (showPassword) {
                    lgFrame.conf_pass_input.setEchoChar((char) 0); // Hiển thị mật khẩu
                    lgFrame.show_conf_pass_btn.setText("Hide Password");
                } else {
                    lgFrame.conf_pass_input.setEchoChar('*'); // Ẩn mật khẩu
                    lgFrame.show_conf_pass_btn.setText("Show Password");
                }
            }
        });
		lgFrame.show_pass_btn.addActionListener(new ActionListener() {
            boolean showPassword = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                showPassword = !showPassword;
                if (showPassword) {
                    lgFrame.password_input.setEchoChar((char) 0); // Hiển thị mật khẩu
                    lgFrame.show_pass_btn.setText("Hide Password");
                } else {
                    lgFrame.password_input.setEchoChar('*'); // Ẩn mật khẩu
                    lgFrame.show_pass_btn.setText("Show Password");
                }
            }
        });
	}
	public void switch_mode(login_frame lgFrame) {
		mode mode = lgFrame.getMode();
		if (mode == mode.login) {
			lgFrame.setMode(mode.signup);
		}else {
			lgFrame.setMode(mode.login);
		}
	}
}
