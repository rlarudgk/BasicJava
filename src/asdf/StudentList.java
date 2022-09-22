package asdf;

public class StudentList implements Comparable<StudentList> {
    private String studentNumber;
    private String name;
    private int KorScore;
    private int engScore;
    private int mathScore;
    private int score;
    private int rank;

	public StudentList(String studentNumber, String name, int korScore, int engScore, int mathScore) {

        this.studentNumber = studentNumber;
        this.name = name;
        this.KorScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
        setScore(korScore, engScore, mathScore);
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorScore() {
        return KorScore;
    }

    public void setKorScore(int korScore) {
        KorScore = korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int KorScore, int engScore, int mathScore) {
        this.score = KorScore + engScore + mathScore;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "StudentList [studentNumber=" + studentNumber + ", name=" + name + ", KorScore=" + KorScore
                + ", engScore=" + engScore + ", mathScore=" + mathScore + ", score=" + score + ", rank=" + rank + "]";
    }

    @Override
    public int compareTo(StudentList member) {
        return this.getStudentNumber().compareTo(member.getStudentNumber());
    }
}
