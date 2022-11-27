public class StudentFiles {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;
        double[] arr;

        arr = StudentRegex.StudentFile(transcript);

        // if there is no match on "transcript", method will return an Array with "No Match" in 1st position.

        if (arr[0] == 0.0) {
            System.out.println("Object not created!");
        } else {

            int studentNumber = (int) arr[0];
            int grade = (int) arr[1];
            int birthDay = (int) arr[2];
            int birthMonth = (int) arr[3];
            int birthYear = (int) arr[4];
            char gender;
            if (arr[5] == 1.0) {
                gender = 'M';
            } else if (arr[5] == 2.0) {
                gender = 'F';
            } else {
                gender = 'O';
            }
            int stateID = (int) arr[6];
            double weightedGPA = arr[7];
            double unWeightedGPA = arr[8];

            Student student01 = new Student(
                    studentNumber,
                    grade,
                    birthDay,
                    birthMonth,
                    birthYear,
                    gender,
                    stateID,
                    weightedGPA,
                    unWeightedGPA
            );

            String fullDate = student01.printFullDate();
            // variable fullDate, will keep information about full date from student file

            student01.printStudentFile();

        }

    }
}
