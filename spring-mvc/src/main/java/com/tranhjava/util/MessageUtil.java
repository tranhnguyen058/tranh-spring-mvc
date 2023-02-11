package com.tranhjava.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.mysql.cj.xdevapi.Result;
@Component
public class MessageUtil {
	public Map<String, String> getMessage(String message){
		Map<String, String> result = new HashMap<>();
		if(message.equals("update_success")) {
			result.put("message", "Update Success");
			result.put("alert", "success");
		}else if(message.equals("insert_success")) {
			result.put("message", "Insert Success");
			result.put("alert", "success");
		}else if(message.equals("delete_success")) {
			result.put("message", "Delete Success");
			result.put("alert", "success");
		}else if(message.equals("error_system")) {
			result.put("message", "Error System");
			result.put("alert", "danger");
		}
		return result;
	}
}
