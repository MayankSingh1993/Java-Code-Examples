public class IfElse {
    public static void main(String []arg){
        int grade = 88;
        double gpa = 5.0;
    if(grade>=80 && gpa >=4.0){
        System.out.println("You got an A");
    }else if(grade >= 70 && gpa >= 3.0){
        System.out.println("You got a B");
    }else if(grade >= 60 && gpa >= 2.0){
        System.out.println("You got a c");
    }else if(grade <60 && gpa <2){
        System.out.println("You got a D");
    }else{
        System.out.println("Study hard next time.");
    }

    }

    
}
