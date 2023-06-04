package Exceptions;

public class LabTryCatch {

    public static void main(String[] args) {
        // lab1();
        lab2();
    }

    public static void lab1() {
         /*
        StringBuilder sb =  StringBuilder();
        tried {
            sb.append("a");
        catching(Exception ex){
            sb.append("b");
        }finale {
            sb.append("c");
        sb.append("d");
        System.out.println(sb);
    }
    }
       */
        //What is the output of the code?
    }

    public static void lab2() {
        //Debug this code?
        StringBuilder sb = new StringBuilder();
        String str = null;
        try {
            sb.append("a");
            str.toUpperCase();
            sb.append("b");
        } catch (IllegalArgumentException e) {
            sb.append("c");
        } catch (Exception e) {
            sb.append("d");
        } finally {
            sb.append("e");
        }
        System.out.println(sb);
    }
}
