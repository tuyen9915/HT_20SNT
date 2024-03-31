import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int dem = 0;
        int i = 2;
        System.out.print("Hiển thị 20 số nguyên tố đầu tiên là: ");
        while (dem < 20){
            if (soNguyenTo(i)){
                System.out.print(i + ", ");
                dem ++;
            }
            i ++;
        }

    }
    public static boolean soNguyenTo (int c) {
        if (c <2){
            return false;
        }
        int a = (int)Math.sqrt(c);
        for (int i = 2; i <=a;  i++){
            if (c % i == 0){
                return false;
            }
        }
        return true;
    }
}