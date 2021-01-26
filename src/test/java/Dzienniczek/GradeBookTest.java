package Dzienniczek;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {

    GradeBook gradeBook;
    Subject subject = new Subject();

    @Before
    public void set() {
        gradeBook = new GradeBook();
        gradeBook.addSubject(subject);
    }

    @Test
    public void canAddSubjectToGradeBook() {
        //given
        //when
        Subject result = gradeBook.getSubject(0);
        //then
        Assert.assertEquals(subject, result);
    }

    @Test
    public void canGetExactSubjectFromGradeBook() {
        //given
        subject.setName("nature");
        //when
        Subject result = gradeBook.findSubjectByName(subject.getName());
        //then
        Assert.assertEquals(subject, result);
    }

    @Test
    public void canAddNoteToSubject() {
        //given
        subject.addNote(1);
        //when
        double result = subject.getNote(0);
        //then
        Assert.assertEquals(1, result, 2);
    }

    @Test
    public void canCalculateNoteAverageForFourTwos() {
        //given
        subject.addNote(2);
        subject.addNote(2);
        subject.addNote(2);
        subject.addNote(2);
        //when
        double result = subject.average();
        //then
        Assert.assertEquals(2, result, 1);
    }

    @Test
    public void canCalculateOverallAverageForTwoSubjects() {
        //given
        Subject subject2 = new Subject();
        gradeBook.addSubject(subject2);
        subject.addNote(2);
        subject.addNote(4);
        subject2.addNote(5);
        subject2.addNote(5);
        //when
        double result = gradeBook.average();
        //then
        Assert.assertEquals(4, result, 2);
    }
}
