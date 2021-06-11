package lession18.homework;

import java.io.IOException;

public class MainCopyHomeWorkFileBuffer {
    public static void main(String[] args) {
        CopyFileHomeWorkImp copy = new CopyFileHomeWorkImp();

        try {
            long start = System.currentTimeMillis();
            copy.copyBuffer("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\Lession18.mp4",
                    "C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\Lession18Buffer.mp4");
            System.out.println("Time copy file Buffer " + (System.currentTimeMillis() - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
