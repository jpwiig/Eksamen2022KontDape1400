package Task1;

public class Task1 {
    public static void main(String[] args) {
        //a) for loop
        System.out.println("Task a");
        for (int i =0; i <= 1000; i+=10 ){ //for loop, this has to be standard due to the number sensitivity
            System.out.print(i + " ");
        }
        //b) while loop
        System.out.println("Task b");
        int j = 0; //initate outside of the while loop
        while (j < 1000){
            System.out.print(j + " ");// the code works downwards
            j+=10;
        }

        //c)
        System.out.println("Task c");
        int start = 10;
        int end = 0;
        for (int i = start; i > -10; i--){ //iterates backward
            System.out.print(i + ", ");
            end = i;
        }
        System.out.print(end - 1); //lazy mans solution
    }
}
