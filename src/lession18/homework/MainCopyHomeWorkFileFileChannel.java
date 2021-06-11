package lession18.homework;

import java.io.IOException;

public class MainCopyHomeWorkFileFileChannel {
    public static void main(String[] args) {
        CopyFileHomeWorkImp copy = new CopyFileHomeWorkImp();

        try {
            long start = System.currentTimeMillis();
            copy.copyFileChannel("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\Lession18.mp4",
                    "C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\Lession18FileChannel.mp4");
            System.out.println("Time copy file FileChannel " + (System.currentTimeMillis() - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
