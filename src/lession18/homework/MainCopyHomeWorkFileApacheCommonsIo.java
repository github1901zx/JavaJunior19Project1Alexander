package lession18.homework;

import java.io.IOException;

public class MainCopyHomeWorkFileApacheCommonsIo {
    public static void main(String[] args) {
        CopyFileHomeWorkImp copy = new CopyFileHomeWorkImp();

        try {
            long start = System.currentTimeMillis();
            copy.copyApacheCommonsIo("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\Lession18.mp4",
                    "C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\Lession18ApacheCommonsIo.mp4");
            System.out.println("Time copy file ApacheCommonsIo " + (System.currentTimeMillis() - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
