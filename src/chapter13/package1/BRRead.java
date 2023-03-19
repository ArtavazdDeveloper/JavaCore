package chapter13.package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BRRead {
    public static void main(String[] args) throws IOException {
        char c;

        //создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bвeдитe символы, 'q' - для выхода."); // читать символы

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
