
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

class Students {
    private String name;
    private int id;
    private String subject;

    double percentage;

    public Students(String name, int id, String subject, double percentage) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return name + "-" + id + "-" + subject + "-" + percentage;
    }
}

public class Advanced {
    public static void main(String[] args) {
        Students student1 = new Students("Dinesh", 1, "Algorithms", 75);
        Students student2 = new Students("Arnav", 2, "Automata", 55);
        Students student3 = new Students("Anamika", 3, "Databases", 80);
        Students student4 = new Students("Vishal", 4, "Networking", 40);
        List<Students> l = new ArrayList();
        l.add(student1);
        l.add(student2);
        l.add(student3);
        l.add(student4);
        // System.out.println(l);
        // Iterator itr = l.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }
        // System.out.println("--------");
        Map<Boolean, List<Students>> map = l.stream()
                .collect(Collectors.partitioningBy(stu -> stu.getPercentage() > 60));
        System.out.println(map);

        List<Students> topPerformer = l.stream()
                .sorted(Comparator.comparing(Students::getPercentage, Comparator.reverseOrder())).limit(3)
                .collect(Collectors.toList());

        System.out.println(topPerformer);

        Map<String, Double> map2 = l.stream()
                .collect(Collectors.toMap(Students::getName, Students::getPercentage));
        System.out.println(map2);

        Set<String> subjectSet = l.stream().map(Students::getSubject).collect(Collectors.toSet());
        System.out.println(subjectSet);

        OptionalDouble highest = l.stream().mapToDouble(Students::getPercentage).max();
        System.out.println("Highest Percentage :" + highest.getAsDouble());

        OptionalDouble lowest = l.stream().mapToDouble(Students::getPercentage).min();
        System.out.println("Lowest Percentage :" + lowest.getAsDouble());

        OptionalDouble average = l.stream().mapToDouble(Students::getPercentage).average();

        System.out.println("Average Percentage :" + average.getAsDouble());
        System.out.println("Total students: " + l.size());

        Map<String, List<Students>> groupBySubject = l.stream()
                .collect(Collectors.groupingBy(Students::getSubject));
        System.out.println(groupBySubject);
    }

}
