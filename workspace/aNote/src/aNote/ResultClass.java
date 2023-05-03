public class ResultClass {

	String name;
	int classSum = 0;
	int classStudent = 1;
	
	int firstSum = 0;

	ResultClass() {
		this.name = "A";
	}

	ResultClass(String name) {
		this.name = name;
	}

	public void calcCount(Classroom[] classroom) {
		for (int i = 0; i < classroom.length; i++) {
			if(classroom[i].studentCount==0) {
				continue;
			}
			if (classroom[i].name.equals(this.name)) {
				
				
				for (int j = 0; j < classroom[i].studentCount; j++) {
					classSum = classroom[i].student[j].studentSum + classSum;
				}
				classStudent = classroom[i].studentCount;
			}
		}
		double avg = classSum / classStudent;
		System.out.println(this.name + "반    총합 : " + this.classSum);
		System.out.println(this.name + "반    평균 : " + avg);
	}

	public void whoFirst(Classroom[] classroom) {
		for (int i = 0; i < classroom.length; i++) {
			if (classroom[i] == null) {
				continue;
			}
			if (classroom[i].name.equals(this.name)) {
				for (int j = 0; j < classroom[i].studentCount; j++) {
					if (firstSum < classroom[i].student[j].studentSum) {
						firstSum = classroom[i].student[j].studentSum;
					}
				}
			}
		}
		System.out.println(this.name + "반에서 총점이 가장 높은 학생은 ");
		for (int i = 0; i < classroom.length; i++) {
			for (int j = 0; j < classroom[i].studentCount; j++) {
				if (firstSum == classroom[i].student[j].studentSum
						&& classroom[i].name.equals(this.name)) {
					System.out.println(classroom[i].student[j].name );
				} else
					continue;
			}
		}
		
		System.out.println("총점은 "+firstSum+"입니다.");

	}

}