package cn.tarena.ht.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Encrpty {
	public static String getMD5Hash(String password,String username){
		/**
		 * source 代表明文
		 * salt      盐，添加佐料
		 * hash    次数
		 */
		Md5Hash result = new Md5Hash(password,username,2);
		return result.toString();
	}
	public static void main(String[] args) {
		Md5Hash result = new Md5Hash("123","tom",2);
		System.out.println(result);
	}
}
