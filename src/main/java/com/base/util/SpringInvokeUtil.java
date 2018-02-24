package com.base.util;

import java.lang.reflect.Method;

public class SpringInvokeUtil {
	
	public static void invokeByService(Object object,String methodName){
		try {
			Method method = object.getClass().getMethod(methodName);
			method.invoke(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
