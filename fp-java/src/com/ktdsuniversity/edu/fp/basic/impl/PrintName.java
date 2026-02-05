package com.ktdsuniversity.edu.fp.basic.impl;

import com.ktdsuniversity.edu.fp.basic.PrintSomething;

public class PrintName implements PrintSomething{
	//repeat 반복한다
	@Override
	public void print(String message) {
		System.out.println(message.repeat(5));
	}

}
