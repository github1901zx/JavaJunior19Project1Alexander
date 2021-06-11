package lession19;

import lession18.CopyFile;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CopyWithCommonIo implements CopyFile {
    @Override
    public void copy(String from, String to) throws IOException {
        File sourse = new File(from);
        File dest = new File(to);
        FileUtils.copyFile(sourse,dest);
    }
}
