package cn.tarena.ht.utils;

import java.io.Serializable;
import java.util.List;

import net.sf.json.JSONArray;

public class ServletResult  implements Serializable {

	private static final long serialVersionUID = 1L;
	public Integer code;
	public String content;
	public String datetime;
	/**
	 * 数据对象
	 */
	public Object returnObject;
	/**
	 * JSON数据
	 */
	public JSONArray jsonArray;
	/**
	 * 列表对象
	 */
	private List<Object> returnList=null;
    private String returnHash;
	public ServletResult() {
	}
	
	public ServletResult(Object obj) {
		returnObject = obj;
	}

	public ServletResult(Integer code, String content,String datetime) {
		this.code = code;
		this.content = content;
		this.datetime=datetime;
	}

	public ServletResult(Integer code, String content, String datetime,Object obj) {
		this.code  = code;
		this.content = content;
		this.datetime=datetime;
		returnObject = obj;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
    
	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public Object getReturnObject() {
		return returnObject;
	}

	public void setReturnObject(Object returnObject) {
		this.returnObject = returnObject;
	}

	public JSONArray getJsonArray() {
		return jsonArray;
	}

	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}

	public List<Object> getReturnList() {
		return returnList;
	}

	public void setReturnList(List<Object> returnList) {
		this.returnList = returnList;
	}

	public String getReturnHash() {
		return returnHash;
	}

	public void setReturnHash(String returnHash) {
		this.returnHash = returnHash;
	}
}
