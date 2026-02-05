package com.ktdsuniversity.edu.fp.basic.impl;

import com.ktdsuniversity.edu.fp.basic.CallSomething;

public class CallAge extends CallSomething{

	@Override
	//어떤 문자를 주면 숫자로 반환시킨다.
	public int call(String message) {
		return Integer.parseInt(message);
	}

}
