package coding.exercises.homeoffice;

import coding.exercises.infy.Circle;
import coding.exercises.infy.Rectangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest {

    public static void findMoviesFromStack(List<Integer> allMovies, List<Integer> moviesToWatch){

        List<Integer> position = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<>(allMovies);
        System.out.println(arrayList.stream().toList());
        moviesToWatch.stream().forEach(movie->{
            int index = arrayList.indexOf(movie);
            arrayList.remove(index);
            arrayList.addFirst(movie);
            System.out.println(arrayList.stream().toList());

        });
        System.out.println(arrayList.stream().toList());

    }

    public static void main(String[] args) {

        List<Integer> allMovies = List.of(1,11,8,7,6,81,21);
        List<Integer> moviesToWatch = List.of(8,11,11,21);

        findMoviesFromStack(allMovies,moviesToWatch);






    }
}
