package lession1;

public class MySecondProgramm {
    public static void main(String[] args) {
        double shirinaRoom = 9.5;
        double dlinnaRoom = 5.0;
        double shirinaTable = 4;
        double dlinnaTable = 2.4;
        double sRoom = shirinaRoom * dlinnaRoom;
        double sTable = shirinaTable * dlinnaTable;
        double tablesToInsertInRoom =(int) (sRoom /  sTable);
        System.out.println ("Столов влезет в комнуту: " + tablesToInsertInRoom);
    }
}
