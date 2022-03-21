import java.util.ArrayList;
import java.util.List;

public class Result {

    protected static boolean checkstudentrange (int value){
        return (value > 0 && value <= 60);
    }

    protected  static  boolean checkinggrades (int value){
        return (value > 0 && value <= 100);
    }

    public static boolean checkingrounding (int grade){
        if(grade < 38){
            return  false;
        }
        else if(grade %5 > 2){
            return true;
        }
        else return  false;
    }

    protected  static boolean checkingstudentswithamountofgrades(List<Integer> grades){
        if(grades.get(0) == grades.size()-1){
            return true;
        }
        else return false;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> gradesafterrounding = new ArrayList<>();
        checkstudentrange(grades.get(0));
        checkingstudentswithamountofgrades(grades);

        for (int i=0; i <= grades.get(0); i++)checkinggrades(grades.get(i));
        for (int i=0; i <= grades.get(0); i++){
           if(checkingrounding(grades.get(i))){
               gradesafterrounding.add(grades.get(i) + (5 - (grades.get(i) % 5 )));
           }
           else gradesafterrounding.add(grades.get(i));
        }

        return gradesafterrounding;
    }

}
