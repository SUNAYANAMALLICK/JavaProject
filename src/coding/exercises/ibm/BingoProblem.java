package coding.exercises.ibm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BingoProblem {

    public static void main(String[] args) {

        List<List<Integer>> matrix =List.of( List.of(10,11,12),  List.of(13,15,14), List.of(16,17,18));
        List<Integer> sequence = List.of(12,15,18,17,11,13,10,16,14);
        List<Integer> output = new ArrayList<>();
        LinkedList<LinkedList<Integer>> list = new LinkedList<>();
        matrix.stream().forEach(row->list.add(new LinkedList<>(row)));
        System.out.println(list);
        sequence.stream().forEach(value->{
            list.stream().filter(row->row.contains(value)).forEach(row->{
                int col = row.indexOf(value);
                int row1 = list.indexOf(row);
                if(row.contains(value)){
                    row.remove(value);
                    System.out.println(list);
                }
            });

        });

    }
}
