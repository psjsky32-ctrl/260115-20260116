package com.ktdsuniversity.edu.inheritance;
//기능 배터리 양 속서 배터리 체크
public class Ev extends Vehicle{
		
	private int batteryAmount;
	
	public Ev(String modelName, int batteryAmount) {
		super(modelName, "위이잉");
		this.batteryAmount = batteryAmount;
	}
//	@Override
//	public void startEngine() {
//		super.startEngine();
//		System.err.println("위이이잉");
//	}
	public void printBatteryAmount() {
		if (super.getIsStart()) {
			String modelName = super.getModelName();
			System.out.println(modelName + " 배터리 잔량은 " + this.batteryAmount + "입니다.");
			}
		}
	}