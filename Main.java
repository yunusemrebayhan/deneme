public class Main {

    public static void main(String[] args) {

       /* String student1 = "yunus";
        String student2 = "emre";
        String student3 = "sefa";
        System.out.println(student1);*/

        String[] students= new String[3];
        students[0]="yunus";
        students[1]="emre";
        students[2]="bayhan";
        //students[3]="ali";
        for(int i=0; i<students.length;i++){
            System.out.println(students[i]);
        }
        System.out.println("********************");

        for(String student:students){
            System.out.println(student);
            System.out.println();
            System.out.println();

        }

    }
}
