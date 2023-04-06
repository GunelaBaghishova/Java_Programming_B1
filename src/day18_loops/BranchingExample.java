package day18_loops;

public class BranchingExample {

    public static void main(String[] args) {

        for (int i = 0; i <=10; i++) {
            System.out.print(i+ " ");
        }
//
        System.out.println();
        for (int i = 0; i <=10; i++) {
//
            if(i == 5){
                System.out.print(i+ "");
                break;

            }
        }
        System.out.println();
        for (int i = 0; i <=10; i++) {
System.out.print(i+ "");
            if(i == 5){
                break;

        }

        }
        System.out.println();
        for (int i = 0; i <=10; i++) {
            System.out.print(i + "");
            break;
        }


        System.out.println();
        System.out.println("---------------------");
        for (int i = 0; i <=10; i++) {       // OUTPUT 01234678910 (SKIPPING NUMBER 5)---> because as it reaching CONTINUE,  it is not doing anythung after CONTINUE and directly go to the nex one (next iteration)

            if (i == 5) {
                continue;


            }
            System.out.print(i + "");
        }


        System.out.println();
        for (int i = 0; i <=10; i++) {
            if (i % 2 == 1) {  // it will output EVEN numbers, because odd number will be skipped, because as it reaching CONTINUE,  it is not doing anything after CONTINUE and directly go to the nex one (next iteration)
                continue;
            }
            System.out.print(i + "");
        }


        System.out.println();
        System.out.println();
        for (int i = 0; i < 100; i++) {
            if (i ==10){
                break;
            }
            System.out.println(i +"" +i);

        }




            }

}

