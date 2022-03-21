/*
Author: Robert Martinko
Job: Student FH-Campus Wien
RepoLink: https://github.com/Tinko1/prog2-ss21-exercise1
 */
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestCases {

    @Test
    void checkingStudents_below_0(){
        assertFalse(Result.checkstudentrange(-1));
    }

    @Test
    void checkingStudents_in_range(){
        assertTrue(Result.checkstudentrange(30));
    }

    @Test
    void checkingStudents_above_60(){
        assertFalse(Result.checkstudentrange(100));
    }

    @Test
    void checkingGrades_below_0(){
        assertFalse(Result.checkinggrades(-1));
    }
    @Test
    void checkingGrades_in_range(){
        assertTrue(Result.checkinggrades(50));
    }

    @Test
    void checkingGrades_above_100(){
        assertFalse(Result.checkinggrades(200));
    }

    @Test
    void checkingrounding_below_38 (){
        assertFalse(Result.checkingrounding(29));
    }

    @Test
    void checkingrounding_add_1(){
        assertTrue(Result.checkingrounding(64));
    }

    @Test
    void checkingrounding_add_2(){
        assertTrue(Result.checkingrounding(63));
    }

    @Test
    void checkingrounding_more_than_2(){
        assertFalse(Result.checkingrounding(61));
    }

    @Test
    void checking_students_equels_grades_more_than_4(){
        List<Integer> grades = new ArrayList();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        grades.add(22);
        assertFalse(Result.checkingstudentswithamountofgrades(grades));
    }

    @Test
    void checking_students_equels_grades(){
        List<Integer> grades = new ArrayList();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        assertTrue(Result.checkingstudentswithamountofgrades(grades));
    }

    @Test
    void checking_students_equels_grades_less_then_4(){
        List<Integer> grades = new ArrayList();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        assertFalse(Result.checkingstudentswithamountofgrades(grades));
    }

    @Test
    void autogradingstudents (){
        List<Integer> grades = new ArrayList();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> actual = Result.gradingStudents(grades);

        List<Integer> expected = new ArrayList();
        expected.add(4);
        expected.add(75);
        expected.add(67);
        expected.add(40);
        expected.add(33);

        assertEquals(expected, actual);

    }








}
