package core.stringActivities;

public class WithouEnd2 {

    /**
     Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
     withouEnd2("Hello") → "ell"
     withouEnd2("abc") → "b"
     withouEnd2("ab") → ""
     */
    public static String withouEnd2(String example){
        int stringLength = example.length();
        return example.substring(1,stringLength - 1);
    }


}
