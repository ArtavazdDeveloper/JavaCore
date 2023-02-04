package homework.homework9;

public class Stack {
     char[] stck = new char[100];
     int tos;

    public Stack(){
        tos = -1;
    }
    void push(char item){
        if (tos == 9)
            return;
        else
            stck[++tos] = item;
    }
    char pop(char item){
        if (tos < 0){
            return 0;
        }
        else
            return stck[tos--];
    }
}

