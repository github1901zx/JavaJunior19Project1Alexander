package practic.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;


public class FilePractice {
    private static final int BSIZE = 128;

    public static void main(String[] args) {
        try {

            FileChannel ch1 = new FileOutputStream("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\data.txt").getChannel();
            String str1 = "Hello\nVlad is my Hero!!!\nMy name Sasha";
            ch1.write(ByteBuffer.wrap(str1.getBytes(StandardCharsets.UTF_8)));
            ch1.close();
            FileChannel ch2 = new FileInputStream("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\data.txt").getChannel();
            ByteBuffer buff = ByteBuffer.allocate(BSIZE);
            ch2.read(buff);
            buff.flip();
            ch2.close();

            StringBuffer s = new StringBuffer("");
            while (buff.hasRemaining()) {
                s.append((char) buff.get());
            }

            FileChannel ch3 = new FileOutputStream("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\dataRes.txt").getChannel();
            String[] mass = s.toString().split("\n");
            for (int i = mass.length - 1; i >= 0; i--) {
                ch3.write(ByteBuffer.wrap(mass[i].getBytes(StandardCharsets.UTF_8)));
                ch3.write(ByteBuffer.wrap("\n".getBytes(StandardCharsets.UTF_8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
