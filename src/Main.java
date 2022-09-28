public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Hello " + args[0]);
        char a = 'a';

//        char int long boolean double float -> Primitive a = 'a';
        long l = 12321L;
        double  d = 123.41;
        float f = 123.3f;
        System.out.println(a);
        System.out.println((int)a);
    }
}

// 0 -> 0  // биты
// 1 -> 0000001
// 2 -> 0000010
// 3 -> 0000011
// 4 -> 0000100
// 255 ->   0000001 1111111 -> 255 1111111 1111111 1111111 1111111 ~2 billion
//                                 1111111 1111111 1111111 1111111 1111111 1111111 1111111 1111111 ~over dofiga

// байты
// 1 байт == 8 бит 00000000
// 0   0   0   0   0   0   0   0 -> 1 байт = 8 бит
// 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0 ->

