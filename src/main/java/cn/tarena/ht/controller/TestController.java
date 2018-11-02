package cn.tarena.ht.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tarena.ht.pojo.User;
import cn.tarena.ht.service.UserService;
import cn.tarena.ht.utils.ServletResult;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private UserService userService;
	
	private ServletResult result = new ServletResult();
	
	@RequestMapping(value = "/getUser", method = RequestMethod.POST)
	public void selectUser(HttpServletRequest request,HttpServletResponse response){//Goal goal
		result.setReturnObject(null);
		result.setCode(403);
		String userId = "123456";
		try {
			User user = userService.findUserByUserId(userId);
			result.setReturnObject(user);
			result.setCode(200);
			response.getWriter().print(JSONObject.fromObject(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/insertJson")
	@ResponseBody
	public void insertJson(@RequestBody User user,HttpServletRequest request,HttpServletResponse response){//Goal goal
		result.setReturnObject(null);
		result.setCode(403);

		try {
			userService.saveUser(user);
			result.setCode(200);
			response.getWriter().print(JSONObject.fromObject(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/insert")
	public void insert(HttpServletRequest request,HttpServletResponse response
			,@RequestParam String username,@RequestParam String password,@RequestParam String unionId){//Goal goal
		result.setReturnObject(null);
		result.setCode(403);
		User user = new User();
		user.setPassword(password);
		user.setUsername(username);
		user.setOpenId(unionId);
		try {
			if (userService.findUserByUnionId(unionId) != null){
				result.setContent("用户已存在");
				result.setCode(201);
			}else{
				userService.saveUser(user);
				result.setCode(200);
			}
			response.getWriter().print(JSONObject.fromObject(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
