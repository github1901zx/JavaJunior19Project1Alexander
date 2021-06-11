package lession18.homework;

import java.io.IOException;

public class MainCopyHomeWorkFilePath {
    public static void main(String[] args) {
        CopyFileHomeWorkImp copy = new CopyFileHomeWorkImp();

        try {
            long start = System.currentTimeMillis();
            copy.copyPath("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\Lession18.mp4",
                    "C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\Lession18Path.mp4");
            System.out.println("Time copy file Path " + (System.currentTimeMillis() - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
