package day12_switch_statements;

import java.util.Scanner;

/*
Ask a user to enter Browser type (single word)

Ask user to enter URL (link - Uniform Resource Locator)
Going in to the URL in chrome browser

 */
public class Browser {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter your browser: ");
        String browser = input.next();
        System.out.print("Enter a URL: ");
        String url = input.next();


        switch (browser){
            case "chrome":
            case "Chrome":
            case "CHROME":
                System.out.println("Going in to the " + url + " in chrome browser" );
                break;

            case "edge":
                System.out.println("Going in to the " + url + " in edge browser" );
                break;

            case "safari":
                System.out.println("Going in to the " + url + " in safari browser" );
                break;

            case "firefox":
                System.out.println("Going in to the " + url + " in firefox browser" );
                break;
            default:
                System.out.println(browser+ "is invalid browser");






        }


    }



}
