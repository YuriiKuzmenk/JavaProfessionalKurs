package lesson10;

import homework10.Database;
import homework10.DbInit;

import java.util.Scanner;

public class CommandLine {
    public void exec() {
        homework10.Database db = new Database();
        db.init(DbInit.init());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("# ");
            String cmd = scanner.next();
            switch (cmd.toLowerCase().charAt(0)) {
                case 'c':
                    db.create();
                    break;
                case 'r':
                    db.read();
                    break;
                case 'u':
                    db.update();
                    break;
                case 'd':
                    db.delete();
                    break;
                case 'x':
                    System.out.println("Exit of command line.");
                    return;
                default:
                    System.out.println("List of command: c[reate], r[ead], u[pdate], d[elete], e[x]it");
            }
        }
    }
}