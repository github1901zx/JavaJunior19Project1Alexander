package lession19;

public class MainCopyFile {
    public static void main(String[] args) {

        CopyWithCommonIo file = new CopyWithCommonIo();

        try{
            long startTime = System.currentTimeMillis();
            file.copy("C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\lession16.mp4","C:\\Users\\Admin\\Desktop\\LessionEasyUM\\Java\\lession16CopyFileApacheCommonIo.mp4");
            System.out.println(System.currentTimeMillis()-startTime);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
