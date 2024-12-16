//Q1 solid patterns
    // ***** 
    // *****
    // *****
    // *****

// import java.util.*;


// public class patterns{
//     public static void main (String args []){
//         int n =4;
//         int m =5;
    
//         for(int i=1;i<=n; i++){
//            for(int j=1;j<=m; j++){
//             System.out.print("*");
//            }
//            System.out.println();
//         }
//     }
// }

//Q2 kollow rectagel
// * * * * *    
// *       *
// *       *
// * * * * *

// import java.util.*;

// public class patterns {
//     public static void main(String args[]) {
//         int n = 4;
//         int m = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 // cell-> (i.j)
//                 if (i == 1 || j == 1 || i == n || j == m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }
  

//Q3 half pyramid
// *
// **
// ***
// ****
// *****

// import java.util.*;

// public class patterns {
//     public static void main(String args[]) {
//         int n = 6;

//      for (int i = 1; i<= n; i++) {
//         for (int j=1; j<=i; j++) {
//             System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }
   

// /Q4 inverted half pyramid
// ******
// *****
// ****
// ***
// **
// *

// import java.util.*;

// public class patterns {
//     public static void main(String args[]) {
//         int n = 6;

//      for (int i = n; i>= 1; i--) {
//         for (int j=1; j<=i; j++) {
//             System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }


  // Q5inverted half pyramide (roted by 180 deg)
//     *
//    **
//   ***
//  ****
// *****

  
// import java.util.*;

// public class patterns {
//     public static void main(String args[]) {
//         int n = 5;
//         //outer loop 
//      for (int i = 1; i<=n; i++) {
//        //inner loop for space
//         for (int s=1; s<=n-i; s++) {
//             System.out.print(" ");
//             }
//            //inner loop for star   
//             for (int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

//Q6 number half  pyramid
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5


// import java.util.*;

// public class patterns {
//     public static void main(String args[]) {
//         int n =5;

//      for (int i = 1; i<= n; i++) {
//         for (int j=1; j<=i; j++) {
//             System.out.print(j+" ");
//             }
//             System.out.println();
//         }

//     }
// }


//Q7 inverted half pyramidewith numbers
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1


// import java.util.*;

// public class patterns {
//     public static void main(String args[]) {
//         int n =5;

//      for (int i=n; i>= 1; i--) {
//         for (int j=1; j<=i; j++) {
//             System.out.print(j+" ");
//             }
//             System.out.println();
//         }

//     }
// }
  


//Q8 floyd's traigle
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

// import java.util.*;

// public class patterns {
//     public static void main(String args[]) {
//         int n =5;
//         int number = 1;

//      for (int i = 1; i<= n; i++) {
//         for (int j=1; j<=i; j++) {
//             System.out.print(number+" ");
//             number++; // number = number+1
//             }
//             System.out.println();
//         }

//     }
// }
   
//Q9 0-1 Triagle
// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1


import java.util.*;

public class patterns {
    public static void main(String args[]) {
        int n =5;

     for (int i = 1; i<= n; i++) {
        for (int j=1; j<=i; j++) {
            int sum = i+j;
            if (sum % 2 ==0) { //even
            System.out.print(1+" ");
            } else { //odd
            System.out.print(0+" ");
            } 
        }

        System.out.println();

    }
}
}