import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentRegex {

    public static double[] StudentFile(String transcript) {

        String regex = """
                Student\\sNumber:\\s(?<studentNumber>\\d{10}).* # Grab student number
                Grade:\\s+(?<grade>\\d{1,2}).* # Grab student grade
                Birthdate:\\s+(?<day>\\d{1,2})/(?<month>\\d{1,2})/(?<year>\\d{1,4}).* # Grab student birthday date
                Gender:\\s+(?<gender>\\w+)\\b.* # grab gender of the student
                State\\sID:\\s+(?<stateId>\\d{10})\\b.* # grab state ID
                Weighted\\)\\s+(?<weightedGPA>[\\d\\.]+)\\b.* # grap weighted GPA
                Unweighted\\)\\s+(?<unWeightedGPA>[\\d\\.]+)\\b.* # grap unweighted GPA
                """;

        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat = pat.matcher(transcript);


        if (mat.matches()) {
            double[] arr = new double[9];
            double studentNumber = Double.parseDouble(mat.group("studentNumber"));
            arr[0] = studentNumber;
            double grade = Double.parseDouble(mat.group("grade"));
            arr[1] = grade;
            double day = Double.parseDouble(mat.group("day"));
            arr[2] = day;
            double month = Double.parseDouble(mat.group("month"));
            arr[3] = month;
            double year = Double.parseDouble(mat.group("year"));
            arr[4] = year;
            String gender = mat.group("gender");
            if (Objects.equals(gender, "M")) {
                arr[5] = 1.0;
            } else if (Objects.equals(gender, "F")) {
                arr[5] = 2.0;
            } else {
                arr[5] = 3.0;
            }
            double stateId = Double.parseDouble(mat.group("stateId"));
            arr[6] = stateId;
            double weightedGPA = Double.parseDouble(mat.group("weightedGPA"));
            arr[7] = weightedGPA;
            double unWeightedGPA = Double.parseDouble(mat.group("unWeightedGPA"));
            arr[8] = unWeightedGPA;

            return arr;
        }
        double[] arr = new double[9];
        arr[0] = 0.0;
        return arr;
    }

}