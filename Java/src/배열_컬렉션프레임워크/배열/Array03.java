package 배열_컬렉션프레임워크.배열;

/*
초기값 있도록 선언하기

기본형타입[] 변수명 = new 기본형타입[배열크기];
변수명[index값] = 값;
기본형타입[] 변수명 = new 기본형타입[] {값1, 값2, ...}; or 기본형타입[] 변수명 = {값1, 값2, ...};

 */
public class Array03 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        int[] array2 = new int[] {1,2,3,4,5};
        int[] array3 = {1,2,3,4,5};

        System.out.println("array1의 값 출력");
        for(int i = 0; i < 5; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("array2의 값 출력");
        for(int i = 0; i < 5; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("array3의 값 출력");
        for(int i = 0; i < 5; i++) {
            System.out.println(array3[i]);
        }
    }
}
