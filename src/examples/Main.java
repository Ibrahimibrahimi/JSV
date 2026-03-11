package examples;

import core.Csv;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Start ===");

        String CsvContent = "id,name,note,gender\n1,ibrahim,15,Male\n2,ahmed,16.5,Male";
        Csv csv = new Csv(CsvContent);

        System.out.println(csv.isCorrect());

    }
}
