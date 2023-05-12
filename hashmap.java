import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        examScore.put("Computer", 100);
        examScore.put("English", 80);
        examScore.put("Math", 70);
        examScore.put("Science", 95);
        examScore.put("Geometry", 60);

        System.out.println(examScore.toString());

        System.out.println(examScore.get("Math"));

        examScore.putIfAbsent("Harshin", 500);

        System.out.println(examScore.toString());

        System.out.println(examScore.getOrDefault("Drashti", -1));

        examScore.forEach((subjects, scores) -> {
            System.out.println(subjects + " - " + scores);
        });


    }
}
