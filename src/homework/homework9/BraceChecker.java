package homework.homework9;

public class BraceChecker {
    public String text;
    char lastSimvol;

    public BraceChecker(String text) {

        this.text = text;
    }

        void check () {
            Stack mystack = new Stack();
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
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
                        lastSimvol = (char)
                                mystack.pop(c);
                        if (lastSimvol != '[') {
                            System.err.println("Erro at:" + i + "opend" + lastSimvol + "but cloced" + c);
                        }
                        break;
                    case ')':
                        lastSimvol = (char) mystack.pop(c);
                        if (lastSimvol != '(') {
                            System.out.println("Erro at:" + i + "opend" + lastSimvol + " but cloced " + c);
                            break;
                        }
                    case '}':
                        lastSimvol = (char) mystack.pop(c);
                        if (lastSimvol != '{') {
                            System.out.println("Erro at: " + i + " opend " + lastSimvol + " but cloced " + c);
                            break;
                        }

                }

            }
        }
    }





    