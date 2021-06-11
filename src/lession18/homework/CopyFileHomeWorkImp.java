package lession18.homework;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileHomeWorkImp implements CopyFileHomeWork {

    @Override
    public void copyPath(String from, String to) throws IOException {
        Path in = Paths.get(from);
        Path out = Paths.get(to);
        Files.copy(in, out);
    }

    @Override
    public void copyBuffer(String from, String to) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(from));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(to));

        int j = 0;

        while (true) {
            j = in.read();
            if (j != -1) {
                out.write(j);
            } else {
                break;
            }
        }
        in.close();
        out.flush();
        out.close();

    }

    @Override
    public void copyFileChannel(String from, String to) throws IOException {
        FileChannel in = new FileInputStream(from).getChannel();
        FileChannel out = new FileOutputStream(to).getChannel();

        out.transferFrom(in, 0, in.size());
        in.close();
        out.close();
    }

    @Override
    public void copyApacheCommonsIo(String from, String to) throws IOException {
       File in = new File(from);
       File out = new File(to);
       FileUtils.copyFile(in,out);
    }
}
