package com.ktdsuniversity.edu.inheritance;

public class BatMobile extends SportsCar {
	
	private boolean isDetachBatPod;

	public BatMobile(String modelName) {
		super(modelName, "부ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ앙");
	}
//	@Override
//	public void startEngine() {
//		// TODO Auto-generated method stub
//		super.startEngine();
//		System.out.println("부아ㅏ아아ㅏ아ㅏㅏ앙ㅇ");
//	}
	public void detachBatPod() {
		if (super.getIsStart()) {
			this.isDetachBatPod = !this.isDetachBatPod;

			String modelName = super.getModelName();
			if (this.isDetachBatPod) {
				System.out.println(modelName + " 배트포드 분리됐습니다.");
			} else {
				System.out.println(modelName + " 배트포드 결합됐습니다.");
			}
		}
	}
}