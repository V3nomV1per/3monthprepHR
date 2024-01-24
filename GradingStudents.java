import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i)<38 || grades.get(i)%5 == 0) {
                continue;
            } else if (grades.get(i)%5 == 4||grades.get(i)%5 == 3) {
                grades.set(i, grades.get(i) + 5 - (grades.get(i)%5));
            }
        }
        return grades;
    }
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<Integer>();
        grades.add(38);
        grades.add(39);
        grades.add(37);
        grades.add(51);
        grades.add(62);
        grades.add(73);
        grades.add(84);
        System.out.println(gradingStudents(grades));
    }
}
