package core;

import java.util.ArrayList;

public class Csv {
    String text = "", sepL = "\n", sepC = ",";
    String[] head;
    ArrayList<String[]> data = new ArrayList<>();

    public Csv(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        /*
         * if some lines has different number of columns (elements) , thatns means csv
         * not in best form
         */

        head = this.text.split(sepL);
        for (int i = 0; i < this.text.split(sepL).length; i++) {
            String line = this.text.split(sepL)[i];
            String[] cols = line.split(sepC);
            
        }

        // compare
        int ColsCount = this.data.get(0).length;
        for (int i = 1; i < this.data.size(); i++) {
            if (ColsCount == this.data.get(i).length) {
                System.out.println("LOADED....." + (i + 1) + "/" + this.data.size() + " Lines");
            } else {
                System.out.println("LOADED....." + (i + 1) + "/" + this.data.size() + " Lines");
                System.out.println("ERROR : Null Value Found at line : " + (i + 1));
                return false;
            }
        }
        return true;
    }

    public String[] getColData(String col) {
        // search

        return null;
    }
}
