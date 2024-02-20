package collections.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ValidParenthesis {
    public static void main(String[] args) {
        ValidParenthesis.validParanthesis("()()()");
        ValidParenthesis.validParanthesis("({[]}))([])()");
        ValidParenthesis.validParanthesis("((({})))([])([])");

        ValidParenthesis.validParanthesisUsingMap("()()()");
        ValidParenthesis.validParanthesisUsingMap("({[]}))([])()");
        ValidParenthesis.validParanthesisUsingMap("((({})))([])([])");
    }

    public static  void validParanthesisUsingMap(final String params){

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');


        Stack<Character> stack = new Stack<>();
        AtomicBoolean result = new AtomicBoolean(true);

        IntStream.range(0,params.length()).forEach(i->{
            if(result.get()){
                Character ch = params.charAt(i);
                if(map.containsKey(ch)){
                    stack.push( ch);
                } else if (map.containsValue(ch)) {
                    if(stack.isEmpty() || map.values().contains(stack.peek())){
                        result.set(false);
                    }
                    else if(map.keySet().stream().filter(key->key.equals(stack.peek())).count()==1){
                        stack.pop();
                    }else{
                        result.set(false);
                    }
                }
            }

        });

        System.out.println(" Input : " + params + " : " + result.get());

    }

    public static void validParanthesis(final String params) {

        AtomicBoolean result = new AtomicBoolean(true);

        Predicate<Character> checkStarting = ch -> ch.equals('(') || ch.equals('{') || ch.equals('[');

        Stack<Character> charStack = new Stack<>();

        params.chars().mapToObj(e -> (char) e).toList().stream().filter(x -> result.get())
                .forEach(x -> {
                    if (checkStarting.test(x)) {
                        charStack.push(x);
                    } else if (x.equals(')')) {
                        if (charStack.empty()) {
                            result.set(false);

                        } else if (charStack.lastElement().equals('(')) {
                            charStack.pop();
                        } else {
                            charStack.push(x);
                            result.set(false);
                        }
                    } else if (x.equals('}')) {
                        if (charStack.empty()) {
                            result.set(false);

                        } else if (charStack.lastElement().equals('{')) {
                            charStack.pop();
                        } else {
                            charStack.push(x);
                            result.set(false);
                        }
                    } else if (x.equals(']')) {
                        if (charStack.empty()) {
                            result.set(false);

                        } else if (charStack.lastElement().equals('[')) {
                            charStack.pop();
                        } else {
                            charStack.push(x);
                            result.set(false);
                        }
                    } else {
                        result.set(false);
                    }

                });
        System.out.println(" Input : " + params + " : " + result.get());


    }
}
