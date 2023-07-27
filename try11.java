import java.util.Scanner;
public class try11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt( );
        int b = 5;
        for(int i=a; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }}
// //         byte b = -128; //-128 - 127
// //         short s = 288; //-32768 - 32767
// //         int i = 1;
// //         long l = 90000000L;
// //         float f = 3.1400000f;
// //         double d = 3.1489898392787328d;
// //         float f1 = d;
// //         System.out.println(b);
// //         System.out.println(s1);
// //         System.out.println(i);
// //         System.out.println(l);
// //         System.out.println(f);
// //         System.out.println(d);

// //     }
// // }

// class try11{
//     static void m(int i){
//         System.out.println("int");
//     }
//     static void m(Integer i){
//         System.out.println("Integer");
//     }
//     public static void main(String[] args) {
//         int s = 30;
//         m(s);
//     }
// }

