public class Student {
    private int studentNumber;
    private int grade;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private char gender;
    private int stateID;
    private double weightedGPA;
    private double unWeightedGPA;

    public Student(int studentNumber, int grade, int birthDay, int birthMonth, int birthYear, char gender, int stateID, double weightedGPA, double unWeightedGPA) {
        setStudentNumber(studentNumber);
        setGrade(grade);
        setBirthDay(birthDay);
        setBirthMonth(birthMonth);
        setBirthYear(birthYear);
        setGender(gender);
        setStateID(stateID);
        setWeightedGPA(weightedGPA);
        setUnWeightedGPA(unWeightedGPA);
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setBirthDay (int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthMonth (int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthYear (int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setGender (char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setStateID (int stateID) {
        this.stateID = stateID;
    }

    public int getStateID() {
        return stateID;
    }

    public void setWeightedGPA (double weightedGPA) {
        this.weightedGPA = weightedGPA;
    }

    public double getWeightedGPA() {
        return weightedGPA;
    }

    public void setUnWeightedGPA (double unWeightedGPA) {
        this.unWeightedGPA = unWeightedGPA;
    }

    public double getUnWeightedGPA() {
        return unWeightedGPA;
    }

    public String printFullDate() {
        String day;
        String month;
        if (birthDay < 10 ) {
            day = "0" + birthDay;
        } else {
            day = String.valueOf(birthDay);
        }
        if (birthMonth < 10 ) {
            month = "0" + birthMonth;
        } else {
            month = String.valueOf(birthMonth);
        }
        return day + "." + month + "." + birthYear;
    }

    public void printStudentFile() {
        System.out.format("Student number: %s\n", studentNumber);
        System.out.format("Grade: %s\n", grade);
        System.out.format("Birthday date: %s\n", printFullDate());
        System.out.format("Gender: %s\n", gender);
        System.out.format("State ID: %s\n", stateID);
        System.out.format("Weighted GPA: %s\n", weightedGPA);
        System.out.format("Unweighted GPA: %s\n", unWeightedGPA);
    }
}


