package paranBalncChk;

import java.util.Stack;

public class ParanthesisBalance {

    private String paranthesis;

    public ParanthesisBalance(String paranthesis) {
        this.paranthesis = paranthesis;
    }

    public ParanthesisBalance() {
        this.paranthesis = "";
    }

    // getter and setter

    public String getParanthesis() {
        return paranthesis;
    }

    public void setParanthesis(String paranthesis) {
        this.paranthesis = paranthesis;
    }

    // checking brackets

    private boolean isOpening(char c) {
        if(c == '(' || c == '{' || c == '[') return true;
        else return false;
    }

    private boolean isClosing(char c) {
        if(c == ')' || c == '}' || c == ']') return true;
        else return false;
    }


    // isBalanced

    public boolean isBalanced() {

        boolean b = false;

        Stack s = new Stack();

        for(int i = 0; i < paranthesis.length(); i++) {

            if(isOpening( paranthesis.charAt(i) ) == true) s.push(new Character(paranthesis.charAt(i)));
            else if(paranthesis.charAt(i) == ' ') i++;
            else if(isClosing( paranthesis.charAt(i) ) == true) s.pop();
            else if(s.isEmpty() == true) break;
            else continue;

        }

        b = s.isEmpty() ? true : false;

        return b;
    }

}
