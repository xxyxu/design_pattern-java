package com.xxyxu.chap2.fig3;

import java.io.IOException;

/**
 * Targetクラス
 * @author xxyxu
 *
 */
public interface FileIO {
    public void readFromFile(String filename) throws IOException;

    public void writeToFile(String filename) throws IOException;

    public void setValue(String key, String value);

    public String getValue(String key);
}
