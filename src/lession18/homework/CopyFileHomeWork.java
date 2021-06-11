package lession18.homework;

import java.io.IOException;

public interface CopyFileHomeWork {

    void copyPath(String from, String to) throws IOException;

    void copyBuffer(String from, String to) throws IOException;

    void copyFileChannel(String from, String to) throws IOException;

    void copyApacheCommonsIo(String from, String to) throws IOException;

}
