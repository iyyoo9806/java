import java.util.Scanner;

public class Main {
	// 1.성적입력
	// 1-1 반입력

	// 2.조회
	// 2-1.지역별성적
	// 2-2.성별별성적
	// 2-3.반별성적
	public static void main(String[] args) {
		Classroom[] group = new Classroom[3];
		group[0] = new Classroom();
		group[1] = new Classroom();
		group[2] = new Classroom();
		group[0].name = "A";
		group[1].name = "B";
		group[2].name = "C";
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 9999; i++) {
			System.out.println("성적 프로그램입니다.");
			System.out.println("1.성적입력 2.조회 q.종료");

			String menu = scanner.nextLine();
			if (menu.equals("1")) {
				System.out.println("성적입력입니다.");
				for (int j = 0; j < 9999; j++) {
					System.out.println("반을 선택해주세요. ");
					System.out.println("1.A반 2.B반 3.C반 q.뒤로가기");
					String choiceClass = scanner.nextLine();
					if (choiceClass.equals("1")) {
						group[0].classStudent();
					} else if (choiceClass.equals("2")) {
						group[1].classStudent();
					} else if (choiceClass.equals("3")) {
						group[2].classStudent();
					} else if (choiceClass.equals("q")) {
						break;
					} else {
						System.out.println(choiceClass + "반은 없습니다.다시 누르세요");
					}

				}

			} else if (menu.equals("2")) {
				System.out.println("조회입니다.");
				for (int j = 0; j < 9999; j++) {
					System.out.println("1.지역별성적 2.성별별성적 3.반별성적 q.뒤로가기");
					String choiceInquiry = scanner.nextLine();
					if (choiceInquiry.equals("1")) {
						ResultRegion[] resultregion = { new ResultRegion("서울"), new ResultRegion("경기"),
								new ResultRegion("충청"), new ResultRegion("강원"), new ResultRegion("전라"),
								new ResultRegion("경상") };
						for(int k =0; k<resultregion.length;k++) {resultregion[k].calcCount(group);
						resultregion[k].whoFirst(group);}
// 						디버깅용
//						resultregion[1].calcCount(group);
//						resultregion[1].whoFirst(group);
					} else if (choiceInquiry.equals("2")) {
						ResultSex[] resultsex = { new ResultSex("남"), new ResultSex("여") };
						for(int k =0; k<resultsex.length;k++) {resultsex[k].calcCount(group);
						resultsex[k].whoFirst(group);}
// 						디버깅용
//						resultsex[1].calcCount(group);
//						resultsex[1].whoFirst(group);
					} else if (choiceInquiry.equals("3")) {
						ResultClass[] resultclass = { new ResultClass("A"), new ResultClass("B"),
								new ResultClass("C") };
						for(int k =0; k<resultclass.length;k++) {resultclass[k].calcCount(group);
						resultclass[k].whoFirst(group);}
// 						디버깅용
//						resultclass[1].calcCount(group);
//						resultclass[1].whoFirst(group);
					} else if (choiceInquiry.equals("q")) {
						break;
					} else {
						System.out.println("1,2,3,q만 누르세요.");
					}

				}
			} else if (menu.equals("q")) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1,2,q 만 누르세요");
			}
		}
		// 확인용
		for (int i = 0; i < 3; i++) {
			int k = group[i].studentCount;
			for (int j = 0; j <= k; j++) {
				if (group[i].student[j] == null) {
					continue;
				}
				System.out.print(group[i].name + "반");
				System.out.print("이름:" + group[i].student[j].name + "총합 :   ");
				System.out.println(group[i].student[j].studentSum);
			}
		}

	}
}