package day20_tsks;

public class DuplicateCharacters {
    public static void main(String[] args) {

       String str = "AAABCCDEEF";
       String uniqueChar = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

          if(uniqueChar.contains("" +  str.charAt(i))){
              continue;
          }

          for (int j = 0; j < str.length() ; j++) {
//
//                char innerLetter = str.charAt(j);

                if(str.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            if(count > 1){

             System.out.print(str.charAt(i));
            }

            uniqueChar += str.charAt(i) ;


        }













    }
}
