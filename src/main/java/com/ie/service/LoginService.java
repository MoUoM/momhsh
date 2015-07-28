package com.ie.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ie.bean.LoginMsg;
import com.ie.common.DateUtil;
import com.ie.dao.impl.LoginDao;

@Service
public class LoginService {

	@Autowired
	private LoginDao loginDao;

	public String loginService(String ip) {
		try {
			LoginMsg login = new LoginMsg();
			Calendar cal = Calendar.getInstance();
			login.setId(cal.getTime().getTime());
			login.setIp(ip);
			login.setDate(DateUtil.getCurrentTime());
			loginDao.insert(login);
		} catch (Exception ex) {
			return "failure";
		}
		return "success";
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

}
