package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContactManager {
//각각의 기능은 메소드로 만든다

	private List<Contact> contactList;

	public ContactManager() {
		this.contactList = new ArrayList<>();

	}

	// "contactList라는 바구니 안에 담긴 모든 데이터(Contact)를 하나씩 꺼내서,
	// 일단 contact라고 부른다"
	// 1.contactList에 Contact 인스턴스를 추가하는 기능.
	public void addContact(Contact contact) {
		this.contactList.add(contact);
	}

	// 2.contactList에 모든 연락처 정보를 출력하는 기능.
	public void printAllContact() {
		System.out.println();
		for (Contact contact : contactList) {
			System.out.println(contact);
			for (Phone phone : contact.getPhones()) {
				if (phone.getPhoneType() == Phone.Type.PERSONAL) {
					System.out.print("전화번호\t: ");
				} else if (phone.getPhoneType() == Phone.Type.HOME) {
					System.out.print("집 전화\t: ");
				} else {
					System.out.print("회사 번호\t: ");
				}
				System.out.println(phone.getPhoneNumber());
			}
		}
	}

	// 3.contactList에서 전화번호 검색 결과 출력하는 기능
	// 예> 010 전화번호에 010이 포함된 연락처의 모든 정보 출력
	public void searchPhoneNumber(String phoneNumber) {
		for (Contact contact : contactList) {
			if (contact.getPhones().toString().contains(phoneNumber)) {
				System.out.println(contact);
			} else {
				System.out.println("안나옴");
			}
		}
	}

	// 4.contactList에서 이름검색 결과 출력하는 기능.
	// 예> "김"을 파라미터로 전달하면 name, firstName, lastName, companyName
	// 에 "김"이 포함된 연락처의 모든 정보를 출력.
	public void searchName(String word) {
		for (Contact contact : contactList) {
			if (contact.getName().contains(word) || contact.getFirstName().contains(word)
					|| contact.getLastName().contains(word) || contact.getCompnay().getCompanyName().contains(word)) {
				System.out.println(contact);
			} else {
				System.out.println("해당 정보가 없습니다");
			}
		}

	}

	// 5. contactList에서 이메일 검색 결과 출력하는 기능
	// 예> "@abc.com"을 파라미터로 전달하면 이메일에 "@abc.com"이 포함된 연락처의 모든 정보 출력
	public void searchEmail(String emailword) {
		for (Contact contact : contactList) {
			if (contact.getEmail().contains(emailword)) {
				System.out.println(contact);
			} else {
				System.out.println("이메일이없습니다");
			}
		}
	}

	// 6. 연락처 정보 수정 기능
	// 예> 다양한 검색의 결과중 하나를 선택해 연락처 정보를 수정할 수 있는 기능.
	// 이름을 변경, 전화번호(개인 집 회사) 수정,이메일 수정, 회사명,직급,회사의 주소 수정
	// 스캐너로 입력받기
	// ContactManager.java 내부

	public void replaceContact(Contact contact) {

		Scanner sc = new Scanner(System.in);

		System.out.println("수정을 시작합니다.");
		while (true) {
			System.out.println("수정할 항목: 1.이름 2.이메일 3.전화번호 4.회사정보 0.수정종료");
			System.out.print("선택: ");
			int menus = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기

			if (menus == 1) {
				System.out.print("새 이름: ");
				contact.setName(sc.nextLine());
			} else if (menus == 2) {
				System.out.print("새 이메일: ");
				contact.setEmail(sc.nextLine());
			} else if (menus == 3) {

				System.out.println("수정할 번호 타입: 1.개인 2.집 3.회사");
				int pType = sc.nextInt();
				sc.nextLine();
				System.out.print("새 번호 입력: ");
				String newNum = sc.nextLine();

				// 기존 리스트에서 타입에 맞는 번호를 찾아 수정
				if (pType >= 1 && pType <= 3) {
					// 인덱스로 접근 (0: 개인, 1: 집, 2: 회사 - 생성 시 순서 기준)
					contact.getPhones().get(pType - 1).setPhoneNumber(newNum);
				}
			} else if (menus == 4) {
				System.out.print("새 회사명: ");
				contact.getCompnay().setCompanyName(sc.nextLine());
				System.out.print("새 직급: ");
				contact.getCompnay().setJob(sc.nextLine());
				System.out.print("새 회사주소: ");
				contact.getCompnay().setAddress(sc.nextLine());
			} else if (menus == 0) {
				System.out.println("수정이 완료되었습니다.");
				break;
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}
	}

	// 7. 연락처 정보 삭제 기능
	// 예> 다양한검색의 결과 중 하나를 선택해 contactList에서 제거하는 기능.
	public void deleteContact(int index) {
		if (index >= 0 && index < contactList.size()) {
			contactList.remove(index);
			System.out.println("연락처가 삭제되었습니다.");
		} else {
			System.out.println("연락처 정보가 없습니다.");
		}
	}

	// 스캐너를써서 사용자 이름, 전화번호, 회사 이름, 이메일 4가지를 입력받아 배열에 저장하기
	// 그 다음으로 만든 기능 쓰기
	public static void main(String[] args) {
		ContactManager manager = new ContactManager();
		Scanner sc = new Scanner(System.in);

		// 1. 스캐너를 써서 회원 정보 5개 입력받아 저장하기
		System.out.println("=== 연락처 입력 ===");
		for (int i = 0; i < 1; i++) {
			System.out.println((i + 1) + "번째 연락처 정보를 입력하세요.");

			System.out.print("이름: ");
			String name = sc.nextLine();

			System.out.print("전화번호: ");
			String phoneNumber = sc.nextLine();
			System.out.print("집 전화번호: ");
			String phoneNumber2 = sc.nextLine();
			System.out.print("회사 전화번호: ");
			String phoneNumber3 = sc.nextLine();

			System.out.print("회사이름(필수X): ");
			String companyName = sc.nextLine();

			System.out.print("회사의 주소(필수X): ");
			String address = sc.nextLine();

			System.out.print("직급(필수X): ");
			String job = sc.nextLine();

			System.out.print("이메일: ");
			String email = sc.nextLine();
			// 입력받은 정보로 Contact생성
			Contact newContact = new Contact();
			newContact.setName(name);
			newContact.setEmail(email);
			// 전화리스트 추가
			newContact.getPhones().add(new Phone(Phone.Type.PERSONAL, phoneNumber));
			newContact.getPhones().add(new Phone(Phone.Type.HOME, phoneNumber2));
			newContact.getPhones().add(new Phone(Phone.Type.COMPANY, phoneNumber3));
			// 회사 생성
			Company comp = new Company();
			comp.setCompanyName(companyName);
			comp.setAddress(address);
			comp.setJob(job);
			newContact.setCompnay(comp);
			// 생성한 연락처 리스트에 저장
			manager.addContact(newContact);
			System.out.println("저장 완료");
		}
		// 스캐너로 선택하기
		// 1.검색하기 2.이름검색 3.이메일검색 4.정보 수정 5.정보 삭제하기

		while (true) {
			System.out.println("1.전체출력 2.번호검색 3.이름검색 4.이메일검색 5.삭제 6.수정 0.종료");
			System.out.print("선택: ");
			int menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				manager.printAllContact();
			} else if (menu == 2) {
				System.out.print("검색할 번호: ");
				manager.searchPhoneNumber(sc.nextLine());
			} else if (menu == 3) {
				System.out.print("검색할 이름: ");
				manager.searchName(sc.nextLine());
			} else if (menu == 4) {
				System.out.print("검색할 이메일: ");
				manager.searchEmail(sc.nextLine());
			} else if (menu == 5) {
				System.out.print("삭제할 인덱스 번호: ");
				manager.deleteContact(sc.nextInt());
			} else if (menu == 6) {
				System.out.print("수정할 연락처의 인덱스 번호: ");
				int index = sc.nextInt();
				sc.nextLine();
			} else if (menu == 0) {
				break;
			}
		}

//		System.out.println("===1.전체 연락처 출력 ===");
//		manager.printAllContact();
//
//		System.out.println("===2.전화번호 검색===");
//		manager.searchPhoneNumber("010");
//
//		System.out.println("===3.이름 초성검색===");
//		manager.searchName("ㅂ");
//
//		System.out.println("===4.이메일 검색===");
//		manager.searchEmail("naver.com");
//
//		System.out.println("=== 7. 삭제 테스트 ===");
//		manager.deleteContact(0);
//
//		System.out.println("=== 7. 삭제 후 전체 목록 ===");
//		manager.printAllContact();
		sc.close();
	}
}