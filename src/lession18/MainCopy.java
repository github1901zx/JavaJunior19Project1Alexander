package lession18;

import org.apache.commons.io.FileUtils;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainCopy {
    public static void main(String[] args) {

//        File startDir = new File("C:\\Users\\Admin\\Desktop\\LessionEasyUM");
//        if(startDir.isDirectory()){
//            File file [] = startDir.listFiles();
//            for (File f:file) {
//                System.out.println(f.getName());
//            }
//        }

        String fromFile = "C:\\Users\\Admin\\Desktop\\LessionEasyUM\\y2mate.com - Занятие 9 18032021 курс java  19 EasyUM_1080p.mp4";
        CopyFileWithsJava7 newCopy = new CopyFileWithsJava7();

        try {
            long startTime = System.currentTimeMillis();
            newCopy.copy(fromFile, "C:\\Users\\Admin\\Desktop\\LessionEasyUM\\y2mate.com - Занятие 9 18032021 курс java  19 EasyUM_1080pCopy.mp4");
            long startTime1 = System.currentTimeMillis();
            System.out.println("Время копирования с JAVA 7 = " + (System.currentTimeMillis() - startTime));
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            long startTime = System.currentTimeMillis();
            Path in = Paths.get("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\y2mate.com - Занятие 9 18032021 курс java  19 EasyUM_1080p.mp4");
            Path out = Paths.get("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\y2mate.com - Занятие 9 18032021 курс java  19 EasyUM_1080pPath.mp4");
            Files.copy(in, out);
            System.out.println("Path Paths time = :" + (System.currentTimeMillis() - startTime));
            Files.delete(out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            long startTime = System.currentTimeMillis();
            File in = new File("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\y2mate.com - Занятие 9 18032021 курс java  19 EasyUM_1080p.mp4");
            File out = new File("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\y2mate.com - Занятие 9 18032021 курс java  19 EasyUM_1080pFile.mp4");
            Files.copy(in.toPath(), out.toPath());
            System.out.println("File to Path time = :" + (System.currentTimeMillis() - startTime));
            Files.delete(out.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            long startTime = System.currentTimeMillis();
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\y2mate.com - Занятие 10 19032021 курс java  19 EasyUM_1080p.mp4"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\y2mate.com - Занятие 10 19032021 курс java  19 EasyUM_1080p111.mp4"));

            int c1 = 0;

            while (true) {
                c1 = bis.read();
                if (c1 != -1) {
                    bos.write(c1);
                } else {
                    break;
                }
            }
            bis.close();
            bos.flush();
            bos.close();
            System.out.println("Время копирования с buffer = " + (System.currentTimeMillis() - startTime));
            Files.delete(new File("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\y2mate.com - Занятие 10 19032021 курс java  19 EasyUM_1080p111.mp4").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            long startTime = System.currentTimeMillis();
            FileChannel sourceChannel = new FileInputStream("C:/Users/Admin/Desktop/LessionEasyUM/y2mate.com - Занятие 9 18032021 курс java  19 EasyUM_1080p.mp4").getChannel();
            FileChannel destChannel = new FileOutputStream("C:/Users/Admin/Desktop/LessionEasyUM/y2mate.com - Занятие 9 18032021 курс java  19 EasyUM_1080pCh.mp4").getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            System.out.println("FileChannel = :" + (System.currentTimeMillis() - startTime));
            sourceChannel.close();
            destChannel.close();
            Files.delete(new File("C:/Users/Admin/Desktop/LessionEasyUM/y2mate.com - Занятие 9 18032021 курс java  19 EasyUM_1080pCh.mp4").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            long startTime = System.currentTimeMillis();
            File copied = new File("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\text1.txt");
            File original = new File("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\text.txt");
            if (original.isFile()) {
                FileUtils.copyFile(original, copied);
            }
            System.out.println("apache.commons.io = :" + (System.currentTimeMillis() - startTime));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
