package com.ie.action;


import net.sf.json.JSONObject;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.ie.common.Log;
import com.ie.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage("json-default")  
@Namespace(value="/load")
@Results({@Result(name="jsonExample", type="json")})  
public class LoginAction extends ActionSupport {

	@Autowired
	private LoginService loginService;
	private String result;

	@Action(value="load")
	public String load(){
		JSONObject json = new JSONObject();
		json.element("ip", result);
		loginService.loginService(result);
		Log.log("加载" + result);
		setResult(json.toString());
		return "jsonExample";
	}
	
	@Action(value="unload")
	public String unload(){
		Log.log("关闭" + result);
		JSONObject json = new JSONObject();
		json.element("ip", result);
		setResult(json.toString());
		return "jsonExample";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
}
