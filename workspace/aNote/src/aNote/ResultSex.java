public class ResultSex {
	String name;
	int sexSum = 0;
	int sexStudent = 0;
	int sexMiddleSum = 0;
	int sexFinalSum = 0;
	int firstSum = 0;

	ResultSex() {
		this.name = "A";
	}

	ResultSex(String name) {
		this.name = name;
	}

	public void calcCount(Classroom[] group) {

		double avg = 0;
		int middleAvg = 0;
		int finalAvg = 0;
		for (int i = 0; i < 3; i++) {
			if (group[i] == null) {
				continue;
			} else {
				for (int j = 0; j < group.length; j++) {
					if (group[i].student[j] == null) {
						continue;
					}
					if (group[i].student[j].sex.equals(this.name)) {
						sexSum = group[i].student[j].studentSum + sexSum;
						sexMiddleSum = group[i].student[j].middleSum + sexMiddleSum;
						sexFinalSum = group[i].student[j].finalSum + sexFinalSum;

						sexStudent++;
					}
				}

			}

		}
		if(sexStudent==0) {sexStudent =1;}
		avg = sexSum / sexStudent;
		middleAvg = sexMiddleSum / sexStudent;
		finalAvg = sexFinalSum / sexStudent;
		System.out.println(this.name + " 학생의 인원 : " + sexStudent);
		System.out.println(this.name + " 학생 중간고사 평 균 : " + middleAvg);
		System.out.println(this.name + " 학생 기말고사 평 균 : " + finalAvg);
		System.out.println(this.name + " 학생의 전체 평 균 : " + avg);

	}

	public void whoFirst(Classroom[] classroom) {
		for (int i = 0; i < classroom.length; i++) {
			if (classroom[i].studentCount == 0) {

				continue;
			}
			for (int j = 0; j < classroom[i].studentCount; j++) {
				if (classroom[i].student[j] == null) {
					continue;
				}
				if (classroom[i].student[j].sex.equals(this.name)) {
					if (firstSum < classroom[i].student[j].studentSum) {
						firstSum = classroom[i].student[j].studentSum;
					}

				}

			}
		}
		System.out.println(this.name + "에서 총점이 가장 높은 학생은 ");
		for (int i = 0; i < classroom.length; i++) {
			for (int j = 0; j < classroom[i].studentCount; j++) {
				if (firstSum == classroom[i].student[j].studentSum
						&& classroom[i].student[j].sex.equals(this.name)) {
					System.out.println(classroom[i].name + "반 " + classroom[i].student[j].name );
				} else
					continue;
			}
		}
		
		System.out.println("총점은 "+firstSum+"입니다.");

	}

}