package com.ktdsuniversity.edu.file;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class FileReadExam {
	/**
	 * NIO java version >= 1.8
	 * 
	 * @param parentPath
	 * @param file
	 */
	public static void readAndPrintFileDescriptionUseNIO(String parentPath, String file) {
		//1.읽으려는 파일을 특정
		File target = new File(parentPath, file);
		//2.파일의 내용을 읽는다
		//3.파일의 내용을 List에 할당한다.
		try {
			List<String> lines = Files.readAllLines(target.toPath());
			//4.파일의 내용을 출력한다
			for(String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * IO java version < 1.8
	 * 
	 * @param parentPath
	 * @param file
	 */
	public static void readAndPrintFileDescriptionUseIO(String parentPath, String file) {
		// 1.읽으려는 파일을 특정해야한다.
		File target = new File(parentPath, file);

		// 2.파일이 존재하는지 확인
		// 3.읽으려는 대상이 진짜 파일이 맞는지 확인.
		if (target.exists() && target.isFile()) {
			// 4.파일의 내용을 읽기 시작
			// 4-1.파일의 바이트를 Chunking 해서 가져온다
			FileReader fileReader = null;
			BufferedReader bufferedReader = null;
			try {
				fileReader = new FileReader(target);
				// 4-2.파일의 내용을 String을 변환한다.
				 bufferedReader = new BufferedReader(fileReader);

				String line = null;
				while (true) {
					line = bufferedReader.readLine();
					// EOF 까지 갔느냐
					if (line == null) {
						bufferedReader.close();//pipe해제
						fileReader.close();//pipe해제
						break;
					} else {
						// 4-3.내용을 출력한다.
						System.out.println(line);
					}
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}finally {
				if(bufferedReader != null) {
					try {
						bufferedReader.close();
					}catch(IOException e) {}
				}
				
				if(fileReader != null) {
					try {
						fileReader.close();
					}catch(IOException e) {}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {

		// 운영체제의 정보를 취득.
		Properties props = System.getProperties();
		String homePath = props.get("user.home").toString();
		System.out.println(homePath);
//		System.out.println(props);
//		System.out.println(props.get("user.home"));
//		
//		Map<String, String> env = System.getenv();
//		System.out.println(env);
//		System.out.println(env.get("HOME"));
//		

		// C:\Java Exam 폴도의 정보를 추출
		// java.io.File
		System.out.println(File.separator);
		File directory = new File(homePath + File.separator + "Java Exam");
		// 1.폴더의 이름 출력
		String directoryName = directory.getName();
		System.out.println(directoryName);
		// 2.이 경로가 가리키는 것이 파일인지 폴더인지를 구분.
		boolean isFile = directory.isFile();
		// isFile의 값이 true이면 파일 이다. false 이면 파일이 아니다.
		System.out.println(isFile);

		boolean isDirectory = directory.isDirectory();
		// isDirectory가 true이면 폴더다. false이면 폴더가 아닌다.
		System.out.println(isDirectory);

		// 3.이 경로가 실제 존재하는 것인지
		boolean exists = directory.exists();
		// exists가 true이면 존재하는 폴더 false이면 존재하지 않는폴더
		System.out.println(exists);
		// 4.이 경로의 크기(폴더의 크기) 출력
		// long을 주는 이유는 파일의 크기 => byte,폴더의 크기 1kb, 2kb 1000kb
		long bytes = directory.length();
		System.out.println(bytes + "byte");
		// C:\Java Exam\Java Exam.txt파일의 정보를 추출
		File textFile = new File(homePath + File.separator + "Java Exam", "Java Exam.txt");
		System.out.println("================================================");
		// 1.파일의 이름을 출력
		String directoryName1 = directory.getName();
		System.out.println(directoryName1);

		// 2.파일이 폴더인지 파일인지 구분해서 출력한다.
		boolean isFile1 = directory.isFile();
		System.out.println(isFile1);

		// 3.이 파일이 실제 존재하는 것인지 출력한다
		boolean exists1 = directory.exists();
		System.out.println(exists1);

		// isDirectory가 true이면 폴더다. false이면 폴더가 아닌다.
		boolean isDirectory1 = directory.isDirectory();
		System.out.println(isDirectory1);

		// 4.파일의 크기를 출력한다
		long bytes1 = directory.length();
		System.out.println(bytes1 + "byte");

		// 5.이 파일이 있는 부모의 경로를 출력한다.
		// 파일을 만들때 사용한다.
		// 첫 번째 방법
		String parentPath = textFile.getParent();
		System.out.println(parentPath);
		// 두 번째 방법
		File parentFile = textFile.getParentFile();
		System.out.println(parentFile);
		// 6.이 파일의 경로를 출력한다.
		String textFilePath = textFile.getAbsolutePath();
		System.out.println(textFilePath);

//		while (true) {
//			readAndPrintFileDescriptionUseIO(homePath + File.separator + "Java Exam", "Java Exam.txt");
//		}
		//readAndPrintFileDescriptionUseIO(homePath + File.separator + "Java Exam", "Java Exam.txt");
		readAndPrintFileDescriptionUseNIO(homePath + File.separator + "Java Exam", "Java Exam.txt");
	}
}
