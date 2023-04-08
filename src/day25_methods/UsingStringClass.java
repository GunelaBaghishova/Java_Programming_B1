package day25_methods;

import my_util.StringUtil;

public class UsingStringClass {

    public static void main(String[] args) {

        System.out.println(StringUtil.reversedStr("David Suleyman"));
        System.out.println("--------------------------------------");
        System.out.println();

        String fixed = StringUtil.fixFormat("aiDa") + " loves " + StringUtil.fixFormat("daVID");
        System.out.println(fixed);
        System.out.println("--------------------------------------");
        System.out.println();

        System.out.println(StringUtil.cameCase("SomeTIMES i underStanD jaVa buT SomeTIMES nOT"));
        System.out.println("--------------------------------------");
        System.out.println();

        System.out.println(StringUtil.frequencyOfCharacters("camera", 'a'));
        System.out.println(StringUtil.frequencyOfCharacters("camera", 'z'));
        System.out.println("--------------------------------------");
        System.out.println();
    }


}
