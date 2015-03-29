package paranBalncChk;

import java.util.Stack;

public class ParenthesisBalance {

    private String parenthesis;

    public ParenthesisBalance(String parenthesis) {
        this.parenthesis = parenthesis;
    }

    public ParenthesisBalance() {
        this.parenthesis = "";
    }

    // getter and setter

    public String getParenthesis() {
        return parenthesis;
    }

    public void setParenthesis(String parenthesis) {
        this.parenthesis = parenthesis;
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

        for(int i = 0; i < parenthesis.length(); i++) {

            if(isOpening( parenthesis.charAt(i) ) == true) s.push(new Character(parenthesis.charAt(i)));
            else if(parenthesis.charAt(i) == ' ') i++;
            else if(isClosing( parenthesis.charAt(i) ) == true) s.pop();
            else if(s.isEmpty() == true) break;
            else continue;

        }

        b = s.isEmpty() ? true : false;

        return b;
    }

}
