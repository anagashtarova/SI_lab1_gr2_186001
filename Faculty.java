class Faculty {
	List<Student> students=new ArrayList<Student>();
	String facultyName;

	//TODO constructor

	//methods

	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void removeStudent(int index) {
		students.remove(index);
	}
	

	public List<Student> getGrades() {
		return students;
	}

	public void setGrades(List<Student> students) {
		this.students = students;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Faculty(List<Student> students, String facultyName) {
		super();
		this.students = students;
		this.facultyName = facultyName;
	}

}