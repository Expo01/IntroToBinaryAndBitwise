public class Main {
    public static void main(String[] args) {
        int a = 25; //11001 binary      16(1),8(1),4(0),2(0),1(1)
        int b = a >> 2; //110 binary. the >> moves the decimal up two spots and effectively knocks off the last two
        // binary values. so 11001 --> 1100 which is equal to the integer 6. 4(1),2(1),1(0)
        System.out.println(b);

        b = a << 1; //now b increased by one decimal place to 110010 which = 50.... 32(1),16(1),8(0),4(0),2(1),1(0)
        System.out.println(b);

        //===================================//

        int c = 25;//11001
        int d = 15;//01111
        // using the & operator says, if the binary place value is '1' for both integers, then the resulting binary
        // also has a 1 for that place value
        int e = c & d; // 01001 --> truncates to 1001 = 9... 8(1),4(0),2(0),1(1)
        System.out.println(e);

        // the | operator says that if either of the place values of the binary representation are 1, then the resulting
        // value is 1

        e = c|d; // 11111  = 31.... 16(1),8(1),4(1),2(1),1(1)
        System.out.println(e);


    }
}