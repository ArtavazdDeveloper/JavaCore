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




        //if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y' )
            //System.out.print(true);



        //for (int x : chars) {
        //    if (x == c) {
        //        k++;
            //}
        //}

        //System.out.println(k);




        //char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        //char[] srv = {'l', 'y'};
        //if (char man = chars3.length)
        //System.out.println(chars2.equals(srv));


        //for (int i = 0; i < chars3.length; i++) {

            //if (new String(chars).indexOf('ly') != -1) {
                //found = true;

            //if(i!=0 && chars[i - 1]=='y' && chars3[i-2]=='l'){
                //chars3[i].['y'];

                //found = true;
            //}
            //if (i == chars3.length - 2 && chars3[i] == 'l') {
                //found = true;

            //} else if (i == chars3.length - 1 && chars3[i] == 'y') {
                //found = true;

            //}else found = false;



        }


    }



