class Student {
	List<Integer> grades=new ArrayList<Integer>();
	String index;
	String firstName;
	String lastName;

	//TODO constructor

	public Student(List<Integer> grades, String index, String firstName, String lastName) {
		//super();
		this.grades = grades;
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	//TODO seters & getters

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getAverage() {
		//TODO
		double prosek=0;
		for(int i=0;i<grades.size();i++){
			prosek+=grades.get(i);
		}
		prosek=prosek/grades.size();
		return prosek;
	}

	public int ECTSCredits() {
		//TODO
		int rez=grades.size()*6;
		return rez;
	}
}
