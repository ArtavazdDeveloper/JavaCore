package homework.homework5;

import java.util.Arrays;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int endSpacesCount = 0;
        int frontSpacesCount = 0;
        boolean stopFront = false;
        boolean stopEnd = false;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] == ' ' && !stopFront) {

                frontSpacesCount++;
            } else {
                stopFront = true;
            }
            if (spaceArray[spaceArray.length - 1 - i] == ' ' && !stopEnd) {
                endSpacesCount++;
            } else {
                stopEnd = true;
            }

            if (stopFront && stopEnd) {
                break;
            }
        }

        char[] newArray = new char[spaceArray.length - frontSpacesCount - endSpacesCount];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = spaceArray[i + frontSpacesCount];

        }
        System.out.print(newArray);

    }
}
