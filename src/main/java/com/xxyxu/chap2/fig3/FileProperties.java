package com.xxyxu.chap2.fig3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Adapter（適合する側）クラス<br>
 * プロパティの集合をファイルに保存する.
 * @author xxyxu
 *
 */
public class FileProperties extends Properties implements FileIO {

    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "writeen by FileProperties");
    }

    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    public String getValue(String key) {
        return getProperty(key, "");
    }

}
