public class ResultRegion {

	String name;
	int regionSum = 0;
	int regionStudent = 0;
	int regionMiddleSum = 0;
	int regionFinalSum = 0;
	int firstSum = 0;

	ResultRegion() {
		this.name = "A";
	}

	ResultRegion(String name) {
		this.name = name;
	}

	public void calcCount(Classroom[] classroom) {

		double avg = 0;
		int middleAvg = 0;
		int finalAvg = 0;
		for (int i = 0; i < classroom.length; i++) {
			if (classroom[i].studentCount == 0) {
				continue;
			}
			for (int j = 0; j < classroom[i].studentCount; j++) {
				if (classroom[i].student[j] == null) {
					continue;
				}
				if (classroom[i].student[j].address.equals(this.name)) {
					regionSum = classroom[i].student[j].studentSum + regionSum;
					regionMiddleSum = classroom[i].student[j].middleSum + regionMiddleSum;
					regionFinalSum = classroom[i].student[j].finalSum + regionFinalSum;
					regionStudent++;
				}

			}
		}
		if(regionStudent==0) {regionStudent =1;}
		avg = regionSum / regionStudent;
		middleAvg = regionMiddleSum / regionStudent;
		finalAvg = regionFinalSum / regionStudent;
		System.out.println(this.name + "의 인원 : " + regionStudent);
		System.out.println(this.name + "중간고사 평 균 : " + middleAvg);
		System.out.println(this.name + "기말고사 평 균 : " + finalAvg);
		System.out.println(this.name + "의 전체 평 균 : " + avg);
	}

	public void whoFirst(Classroom[] classroom) {
		for (int i = 0; i < classroom.length; i++) {
			if (classroom[i] == null) {
				continue;
			}
			for (int j = 0; j < classroom[i].studentCount; j++) {
				if (classroom[i].student[j] == null) {
					continue;
				}
				if (classroom[i].student[j].address.equals(this.name)) {
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
						&& classroom[i].student[j].address.equals(this.name)) {
					System.out.println(classroom[i].name + "반 " + classroom[i].student[j].name );
				} else
					continue;
			}
		}
		
		System.out.println("총점은 "+firstSum+"입니다.");
		

	}

}