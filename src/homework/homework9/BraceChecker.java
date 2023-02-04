
package homework.homework9;

public class BraceChecker {
    public String text2;
    public char lastSimvol;


    public BraceChecker(String text) {

         text2 = text;
    }

    void check () {
        Stack mystack = new Stack();
        for (int i = 0; i < text2.length(); i++) {
            char c = text2.charAt(i);
            switch (c) {
                case '[':
                    mystack.push(c);
                    break;


                case '(':
                    mystack.push(c);
                    break;

                case '{':
                    mystack.push(c);
                    break;


                case ']':
                    lastSimvol = mystack.pop(c);
                    //if (lastSimvol != ']') {
                    //    System.out.println("Erro at: " + i + " opend " + lastSimvol + " but cloced " + c);
                    if (c != '[') {
                        System.out.println(" Erro at: " + i + " opend " + lastSimvol + " but cloced " + c);
                    }else if (c == ']'){
                        System.out.println("Error opend: " + i + " index Closed " + c + " but not open.");
                    }

                    break;
                case ')':
                    lastSimvol =  mystack.pop(c);
                    if (c != ')') {
                        System.out.println(" Erro at: " + i + " opend " + lastSimvol + " but cloced " + c);
                    } else if (c != ')') {
                        System.out.println("Error opend: " + i + " index Closed " + c + " but not open.");
                    }
                    break;
                case '}':
                    lastSimvol =  mystack.pop(c);
                    if (c != '{') {
                        System.out.println("Erro at: " + i + " opend " + lastSimvol + " but cloced " + c);
                    } else if (lastSimvol == '}') {
                        System.out.println("Error opend: " + i + " index Closed " + c + " but not open.");
                    }
                    break;

            }

        }
    }
}
