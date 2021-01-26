package Dzienniczek;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Double> noteList = new ArrayList<>();
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List addNote(double note){
        noteList.add(note);
        return noteList;
    }

    public double getNote(int index){
        return noteList.get(index);
    }

    public double average(){
        double sum = 0;
        for(int i = 0; i<noteList.size(); i++){
            sum = sum + noteList.get(i);
        }
        return sum/noteList.size();
    }
}
