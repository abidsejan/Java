public class PatternProblems {
    //1
    static void square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print("* ");
            System.out.println();
        }
    }
    //2
    static void rightTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }
    //3
    static void invertedRightTriangle(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }
    //4
    static void pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }
    }
    //5
    static void invertedPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }
    }
    //6
    static void diamond(int n){
        pyramid(n);
        invertedPyramid(n-1);
    }
    //7
    static void hollowSquare(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    //8
    static void hollowTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==n||j==1||j==i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    //9
    static void numberTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print(j+" ");
            System.out.println();
        }
    }
    //10
    static void floydTriangle(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print(num+++" ");
            System.out.println();
        }
    }
    //11
    static void zeroOneTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print((i+j)%2+" ");
            System.out.println();
        }
    }
    //12
    static void palindromePyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=i;j>=1;j--) System.out.print(j);
            for(int j=2;j<=i;j++) System.out.print(j);
            System.out.println();
        }
    }
    //13
    static void pascalTriangle(int n){
        for(int i=0;i<n;i++){
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    //14
    static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=1;j<=2*(n-i);j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=1;j<=2*(n-i);j++) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
    }
    //15
    static void rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=n;j++) System.out.print("*");
            System.out.println();
        }
    }
    //16
    static void hourglass(int n){
        invertedPyramid(n);
        pyramid(n-1);
    }
    //17
    static void zigzag(int n){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=n;j++){
                if((i+j)%4==0||(i==2&&j%4==0)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    //18
    static void halfDiamond(int n){
        rightTriangle(n);
        invertedRightTriangle(n-1);
    }
    //19
    static void hollowPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1||i==n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    //20
    static void hollowDiamond(int n){
        hollowPyramid(n);
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    //21
    static void numberPalindromeTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--) System.out.print(j);
            for(int j=2;j<=i;j++) System.out.print(j);
            System.out.println();
        }
    }
    //22
    static void binaryTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print((i+j)%2);
            System.out.println();
        }
    }
    //23
    static void xPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j||i+j==n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    //24
    static void sandglass(int n){
        invertedPyramid(n);
        pyramid(n-1);
    }
    //25
    static void spiralMatrix(int n){
        int[][] arr=new int[n][n];
        int val=1,top=0,bottom=n-1,left=0,right=n-1;
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++) arr[top][i]=val++;
            top++;
            for(int i=top;i<=bottom;i++) arr[i][right]=val++;
            right--;
            for(int i=right;i>=left;i--) arr[bottom][i]=val++;
            bottom--;
            for(int i=bottom;i>=top;i--) arr[i][left]=val++;
            left++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {

        System.out.println("1. Square Pattern");
        square(5);

        System.out.println("2. Right Triangle");
        rightTriangle(5);

        System.out.println("3. Inverted Right Triangle");
        invertedRightTriangle(5);

        System.out.println("4. Pyramid");
        pyramid(5);

        System.out.println("5. Inverted Pyramid");
        invertedPyramid(5);

        System.out.println("6. Diamond");
        diamond(5);

        System.out.println("7. Hollow Square");
        hollowSquare(5);

        System.out.println("8. Hollow Triangle");
        hollowTriangle(5);

        System.out.println("9. Number Triangle");
        numberTriangle(5);

        System.out.println("10. Floyd Triangle");
        floydTriangle(5);

        System.out.println("11. 0-1 Triangle");
        zeroOneTriangle(5);

        System.out.println("12. Palindrome Pyramid");
        palindromePyramid(5);

        System.out.println("13. Pascal Triangle");
        pascalTriangle(5);

        System.out.println("14. Butterfly");
        butterfly(5);

        System.out.println("15. Rhombus");
        rhombus(5);

        System.out.println("16. Hourglass");
        hourglass(5);

        System.out.println("17. Zigzag");
        zigzag(9);

        System.out.println("18. Half Diamond");
        halfDiamond(5);

        System.out.println("19. Hollow Pyramid");
        hollowPyramid(5);

        System.out.println("20. Hollow Diamond");
        hollowDiamond(5);

        System.out.println("21. Number Palindrome Triangle");
        numberPalindromeTriangle(5);

        System.out.println("22. Binary Number Triangle");
        binaryTriangle(5);

        System.out.println("23. X Pattern");
        xPattern(7);

        System.out.println("24. Sandglass");
        sandglass(5);

        System.out.println("25. Spiral Matrix");
        spiralMatrix(4);
    }
}