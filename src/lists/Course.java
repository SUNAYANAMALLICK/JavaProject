package lists;

import java.util.HashMap;

public class Course implements Comparable<Course>{
     String name;
     String author;
     float price;
     float version;

    public Course() {
    }

    public Course(String name, String author, float price, float version) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Course o) {
        return name.compareTo(o.name);
    }
}
