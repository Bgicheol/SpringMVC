package com.ezen.springmvc.common;

import org.springframework.stereotype.Component;

@Component
public class MyReducer_imp1 implements MyReducer{
	@Override
	public Integer reduce(Integer[] arr) {
		int total = 0;
//		for (int i = 0; i < arr.length; ++i) {
//			if (arr[i] != null) {
//				total += arr[i];
//			}
//		}
		
		for (Integer i : arr) {
			total += i == null ? 0 : i;
		}
		
		return total;
	}

}
