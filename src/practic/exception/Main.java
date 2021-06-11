package practic.exception;

public class Main {
    public static void main(String[] args) {
        try {
            Human human0 = new Human(1,"Valera");
        }catch (HumanException e){
            e.printStackTrace();
        }finally {
            System.out.println("выполнена с помощь Finally");
//            Работает всегда, кроме:
//            Если вы вызовете System.exit()
//            Если вы вызовете Runtime.getRuntime().halt(exitStatus)
//            Если JVM выйдет из строя первым
//            Если JVM достигает бесконечного цикла (или какого-либо другого не прерываемого, не завершающего оператора) в блоке try или catch
//            Если OS принудительно завершает процесс JVM; например, kill -9 <pid> на UNIX
//            Если хост-система умирает; например, сбой питания, аппаратная ошибка, паника OS и так далее
//            Если блок finally будет выполняться потоком демона, а все остальные потоки, не являющиеся демонами, выйдут до вызова finally
        }

        Human human1 = new Human(); // не проверяемое исключение
        human1.setName("");
    }
}
