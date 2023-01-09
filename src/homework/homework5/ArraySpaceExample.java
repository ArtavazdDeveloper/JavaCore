package homework.homework5;

import java.util.Arrays;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int newArrayLength = 0;
        int frontSpacesCount = 0;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ') {
                newArrayLength++;
                frontSpacesCount++;
            } else {
                break;
            }
        }
        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] == ' ') {
                newArrayLength++;
            } else {
                break;
            }
        }
        char[] newArray = new char[spaceArray.length - newArrayLength];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = spaceArray[i + frontSpacesCount];

        }
        System.out.print(newArray);

    }
}
