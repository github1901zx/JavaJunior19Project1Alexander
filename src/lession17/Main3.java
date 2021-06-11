package lession17;


public class Main3 {
    public static void main(String[] args) {
        StringUtilsImpl utils = new StringUtilsImpl();
        try{
            System.out.println(utils.div("0","5"));
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        try {
            utils.findNumbers("dsmfnads3.4gba4.6dskjg 5.6 45.");
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        try{
            utils.findWord("JavaSe, JavaSrcipt, hjghjJavasdgasngmas, Java","Java");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }


    }
}
