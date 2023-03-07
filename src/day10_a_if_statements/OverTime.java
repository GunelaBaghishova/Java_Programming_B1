package day10_a_if_statements;

// create a double variable for your hourly rate
//         create a double variable for the number of hours worked
//
//         calculate your net pay, with consideration of overtime pay
//
//         if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
//         (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)





public class OverTime {

    public static void main(String[] args) {
        double hourlyRate = 100;
        double workedHours = 30;
        double netPay;
        double extraHours = workedHours-40;
        netPay =hourlyRate *workedHours;

////        netPay = netPay + extraHours * (hourlyRate*1.5); same thing as lower
//        netPay +=extraHours * (hourlyRate*1.5);





        if (workedHours > 40){
    // I have worked more than 40 hours
            netPay +=extraHours * (hourlyRate*1.5);
            System.out.println("You worked " +workedHours+ " hours at the rate of $"+hourlyRate + ", but with " + extraHours + " exstra hours overtime. So, you get total pay of $ "+netPay);

        }else {

            netPay = hourlyRate *workedHours;
            System.out.println("You worked " +workedHours+ " hours at the rate of $"+hourlyRate + ". So, you get total pay of $" +netPay);

        }















    }


}
