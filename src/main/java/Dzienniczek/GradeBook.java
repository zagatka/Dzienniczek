package Dzienniczek;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    List<Subject> listOfSubjects = new ArrayList<>();

    public void addSubject(Subject subject) {
        listOfSubjects.add(subject);
    }

    public Subject getSubject(int i) {
        return listOfSubjects.get(i);
    }

    public Subject findSubjectByName(String name) {
        for (int i = 0; i < listOfSubjects.size(); i++) {
            if (listOfSubjects.get(i).getName().equals(name)) {
                return listOfSubjects.get(i);
            }
        }
        return null;
    }

    public double average(){
        double sum = 0;
        for (int i = 0; i < listOfSubjects.size(); i++) {
            sum+=listOfSubjects.get(i).average();
        }
        return sum/listOfSubjects.size();
    }

}
