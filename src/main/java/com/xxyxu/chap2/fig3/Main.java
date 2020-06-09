package com.xxyxu.chap2.fig3;

import java.io.IOException;

/**
 * Client（依頼者）クラス
 * @author xxyxu
 *
 */
public class Main {
    public static void main(String[] args) {
        final String inputFilePath = "/Users/xxyxu/git/design_pattern-java/src/main/java/com/xxyxu/chap2/fig3/file.txt";
        final String outputFilePath = "/Users/xxyxu/git/design_pattern-java/src/main/java/com/xxyxu/chap2/fig3/newfile.txt";

        FileIO f = new FileProperties();
        try {
            f.readFromFile(inputFilePath);
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile(outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
