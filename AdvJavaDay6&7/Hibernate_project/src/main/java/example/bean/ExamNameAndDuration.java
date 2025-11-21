package example.bean;

public class ExamNameAndDuration {

	private String examname;
	private int examDuration;
	public ExamNameAndDuration() {
		// TODO Auto-generated constructor stub
	}
	public ExamNameAndDuration(String examname, int examDuration) {
		super();
		this.examname = examname;
		this.examDuration = examDuration;
	}
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	public int getExamDuration() {
		return examDuration;
	}
	public void setExamDuration(int examDuration) {
		this.examDuration = examDuration;
	}

}
