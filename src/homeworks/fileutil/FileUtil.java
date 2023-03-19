package homeworks.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //fileSearch();
        //findLines();
        //printSizeOfPackage();
        //contentSearch();
        createFileWithContent();
    }
    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("please write folder name or file path");
        String patch = scanner.nextLine();
        System.out.println("please write the name of the file");
        String fileName = scanner.nextLine();
        File file = new File(patch, fileName);
        System.out.println(file.exists());
    }
    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Please input patch");
        String patchDirectory = scanner.nextLine();
        System.out.println("Please input text");
        String keyword = scanner.nextLine();
        File directory = new File(patchDirectory);

        File[] files = directory.listFiles();
        for (File file : files) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                if (line.contains(keyword)) {
                    System.out.println("File found: " + file.getAbsolutePath());
                    break;
                }
                line = reader.readLine();
            }
            reader.close();
        }
    }
    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("please write folder name or file path");
        String patch = scanner.nextLine();
        System.out.println("please write the name of the file");
        String keyword = scanner.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(patch))) {
            bw.write(keyword);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Please input directory");
        String directoryPatch = scanner.nextLine();
        File directory = new File(directoryPatch);
        long totalLength = 0;

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    totalLength += file.length();
                }
            }
        }

        System.out.println("Total length of all files in the directory: " + totalLength + " bytes");
    }
    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {
        System.out.println("Enter file name:");
        String filename = scanner.nextLine();
        System.out.println("Enter data to write to file:");
        String content = scanner.nextLine();
        System.out.println("Enter the path to create the file");
        String path = scanner.nextLine();
        scanner.close();

        try {
            File file = new File(path,filename);
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("Data was successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing data to file.");
            e.printStackTrace();
        }
    }
}

