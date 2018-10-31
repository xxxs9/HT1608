package cn.tarena.ht.utils;

import java.util.UUID;

/**
 * Created by chj 
 * 用于生成不重复的序列
 * 1.id
 */
public class UUIDUtil {
	
	public static synchronized String getUUID(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replaceAll("\\-", "");
	}
	
}
