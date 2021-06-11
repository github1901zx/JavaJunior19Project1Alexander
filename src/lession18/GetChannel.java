package lession18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {

    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        // Запись в файл:
        FileChannel fc = new FileOutputStream("src//lession18//data1.txt").getChannel();
        fc.write(ByteBuffer.wrap("no many text".getBytes()));
        fc.close();
        // Добавление в конец файла:
        fc = new RandomAccessFile("src//lession18//data1.txt", "rw").getChannel();
        fc.position(fc.size()); // Переходим в конец
        fc.write(ByteBuffer.wrap(" more text".getBytes()));
        fc.close();
        // Чтение файла:
        fc = new FileInputStream("src//lession18//data1.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while(buff.hasRemaining())
            System.out.print((char)buff.get());
    }
}
