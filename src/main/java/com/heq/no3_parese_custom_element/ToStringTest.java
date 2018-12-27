package com.heq.no3_parese_custom_element;

/**
 * @Auther: heq
 * @Date: 2018/12/20
 * @Description:
 */
public class ToStringTest {
    public static void main(String[] args) {
        WilltoStringInvoked will = new WilltoStringInvoked();
        // #breakpoint1
        System.out.println("If breakpoint here value will be 1");
        /**
         * If we set an breakpoint before this method the output will
         * be 1, otherwise the output will be 0
         */
        System.out.println(will.getValue());
        // #breakpoint2
        System.out.println("If breakpoint here value will be 0");
    }

    static class WilltoStringInvoked {
        private volatile int value = 0;
        private int setValue() {
            if (value == 0) {
                synchronized (this) {
                    if (value == 0) {
                        value = 1;
                    }
                }
            }
            return value;
        }
        public int getValue() {
            return value;
        }
        @Override
        public String toString() {
            return "This value is: " + setValue();
        }
    }
}
