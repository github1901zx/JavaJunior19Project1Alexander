package lession18;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/lession18/1234.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/lession18/1234cop.jpg"));

            int c = 0;

            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}


