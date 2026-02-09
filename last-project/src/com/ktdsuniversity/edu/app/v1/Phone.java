package com.ktdsuniversity.edu.app.v1;

public class Phone {
	
	public static enum Type{
		PERSONAL, HOME, COMPANY
	}
	
	private Phone.Type phoneType;
	
	private String phoneNumber;
	
	public Phone(Phone.Type phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}

	public Phone.Type getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(Phone.Type phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

//	@Override
//	public String toString() {
//		return "전화번호" + this.phoneNumber;
//	}
	@Override
	public String toString() {
		
		StringBuffer pN = new StringBuffer();

		if (this.phoneType == Phone.Type.PERSONAL) {
			pN.append("개인");
		}
		else if (this.phoneType == Phone.Type.HOME) {
			pN.append("집");
		}
		else if (this.phoneType == Phone.Type.COMPANY) {
			pN.append("회사");
		}
		pN.append(", ");
		pN.append("전화번호: " + this.phoneNumber);
		return pN.toString();
	}
}
