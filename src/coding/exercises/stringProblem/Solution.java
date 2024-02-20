package coding.exercises.stringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Statement;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void virusIndices(String p, String v) {
        // Print the answer for this test case in a single line
        List<String> subStringList = new ArrayList<>();
        List<String> start = new ArrayList<>();
        List<String> end = new ArrayList<>();
        subStringList.addAll(
                IntStream.range(0, p.length()-v.length()+1).mapToObj(action->
                        p.substring(action, action+v.length())).collect(Collectors.toList()));

        IntStream.range(1,v.length())
                .forEach(action->{start.add(action ==0 ? v : v.substring(0, action));
                    end.add(v.substring(action, v.length()));
                });

        if (subStringList.contains(v)){
            //map.put(v,subStringList.indexOf(v));
            System.out.print(subStringList.indexOf(v) + " ");
            subStringList.remove(v);
        }

        List<Integer> matchStart = subStringList.stream()
                .filter(item1 -> start.stream().anyMatch(item1::startsWith))
                .mapToInt(value->p.indexOf(value)).boxed().collect(Collectors.toList());


        if(!matchStart.isEmpty()){
            int max = matchStart.stream().mapToInt(i->i).max().getAsInt();
            IntStream.range(0,max+1).forEach(value->subStringList.remove(value));
        }

        matchStart.addAll(subStringList.stream()
                .filter(item1 -> end.stream().anyMatch(item1::endsWith))
                .mapToInt(value->p.indexOf(value)).boxed().collect(Collectors.toList()));

        if(matchStart.isEmpty()){
            System.out.print("No Match!");
        }else{
            Collections.sort(matchStart);
            matchStart.forEach(action->System.out.print(action + " "));
        }
        // forEach(value->System.out.print(p + " : "+ value + " : " + p.indexOf(value)));
        System.out.println();

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String p = firstMultipleInput[0];

                String v = firstMultipleInput[1];

                virusIndices(p, v);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }


}
