package coding.exercises.epam;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class CodingTest {

//    public int solution(int[] A) {
//        // Implement your solution here
//        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
//        Collections.sort(list);
//        int min = list.get(0);
//        int max = list.get(A.length-1);
//        AtomicInteger val = new AtomicInteger();
//        IntStream.range(min,max).filter(i-> val.get() ==0).forEach(i->val.set((!list.contains(i))?i:0));
//        return val.get();
//    }

    public String solution(String S) {
        // Implement your solution here
        List<Character> lowerCase = S.chars().filter(Character::isLowerCase).mapToObj(ch->(char)ch).collect(Collectors.toList());
        List<Character> upperCase = S.chars().filter(Character::isUpperCase).mapToObj(ch->(char)ch).collect(Collectors.toList());

        AtomicReference<String> str = new AtomicReference<>(null);

        lowerCase.stream().map(Character::toUpperCase).forEach(ch->{
             if(upperCase.contains(ch)){
                 if(null!= str.get()){
                     if(ch > str.get().charAt(0)){
                         str.getAndSet(ch.toString());
                     }
                 }else {
                     str.getAndSet(ch.toString());
                 }
             }

        });

       return str.get();


    }

    public static void main(String[] args) {

    }
}
