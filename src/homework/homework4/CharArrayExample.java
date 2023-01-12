package homework.homework4;

import chapter4.OpBitEquals;

public class CharArrayExample {
    public static void main(String[] args) {


        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e', 'o'};
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        boolean found = false;
        char c = 'o';

        int count = 0;
        for (char aChars: chars ){
            if(aChars == c){
                count++;
            }
        }
        System.out.println("count of :" + count);
        System.out.print(chars2[chars2.length/2] + ",");
        System.out.print(chars2[(chars2.length/2) + 1]);

        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println(true);

        }else{
            System.out.println(false);
        }

        for (char aChar : text){
            if (aChar != ' '){
                System.out.print(aChar);
            }
        }




        }


    }



