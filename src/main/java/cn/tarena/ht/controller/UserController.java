package cn.tarena.ht.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;
import cn.tarena.ht.service.UserService;
import cn.tarena.ht.utils.ServletResult;

@Controller
@RequestMapping("/sysadmin/user/")
public class UserController {
	@Autowired
	private UserService userService;
	
	private ServletResult result = new ServletResult();
	
	
	@RequestMapping("login")
	public void login(HttpServletRequest request,HttpServletResponse response){
		result.setReturnObject(null);
		result.setCode(403);
		
		String jsonObj = request.getParameter("jsonObj");
		JSONObject jsonObject = JSONObject.fromObject(jsonObj);
		User user = (User) JSONObject.toBean(jsonObject, User.class);
		try {
			//查看是否需要注册，不许注册直接返回
			result = userService.register(user, result);

			response.getWriter().print(JSONObject.fromObject(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping("update")
	public void updateUser(HttpServletRequest request,HttpServletResponse response){
		result.setReturnObject(null);
		result.setCode(403);
		
		String jsonObj = request.getParameter("jsonObj");
		JSONObject jsonObject = JSONObject.fromObject(jsonObj);
		User user = (User) JSONObject.toBean(jsonObject, User.class);
		try {
			//查看是否需要注册，不许注册直接返回
			result = userService.updateUser(user, result);

			response.getWriter().print(JSONObject.fromObject(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//测试
//	@RequestMapping("cs")
	public void save(){
		String userId = "7c2960fa-dcbd-47ee-9bf3-1c75a6695c6f";
		User user = userService.findUserByUserId(userId);
		UserInfo userInfo = user.getUserInfo();
//		User user = new User();
//		UserInfo userInfo = new UserInfo();
//		UserMotion userMotion = new UserMotion();
//		user.setUsername("cs002");
//		user.setUserInfo(userInfo);
//		user.setUserMotion(userMotion);
//		//新增用户
//		userService.saveUser(user);
		
		//转向用户列表页面
//		return "redirect:/sysadmin/user/list";
	}
	
//	@RequestMapping("list")
	public String userList(Model model){
		List<User> userList = userService.findUserList();
		model.addAttribute("dataList", userList);
		return "sysadmin/user/jUserList";
	}
	@RequestMapping("delete")
	public String delete(@RequestParam("userId") String[] userIds){
		userService.deleteUsers(userIds);
		return "redirect:/sysadmin/user/list";
	}
	
	//转向用户新增页面
//	@RequestMapping("tocreate")
	public String tocreate(Model model){
		
		//查询所有用户信息填写上级领导
		List<User> userList = userService.findUserList();
		//准备部门下拉列表
//		List<Dept> deptList = deptService.findDeptList();
		model.addAttribute("userList", userList);
//		model.addAttribute("deptList", deptList);
		
		return "sysadmin/user/jUserCreate";
	}
	
//	@RequestMapping("save")
	public void save(HttpServletRequest request,HttpServletResponse response){
		result.setReturnObject(null);
//		String jsonObj = request.getParameter("jsonObj");
//		JSONObject jsonObject = JSONObject.fromObject(jsonObj);
//		User user = (User) JSONObject.toBean(jsonObject, User.class);
		
		try {
			//新增用户
//			userService.saveUser(user);
			//转向用户列表页面
			response.getWriter().print(JSONObject.fromObject(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
