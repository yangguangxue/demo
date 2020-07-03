package com.ygx.demo.test;

public class SingleLeton {

//    private static final SingleLeton SINGLE_LETON = new SingleLeton();
//
//    private SingleLeton(){}
//
//    public static SingleLeton getSingleLeton() {
//        return SINGLE_LETON;
//    }

        private static volatile SingleLeton singleLeton ;

        private SingleLeton(){}

        public static SingleLeton getSingleLeton(){
            if (singleLeton == null) {
                synchronized (SingleLeton.class){
                    if (singleLeton==null) {
                        singleLeton = new SingleLeton();
                    }
                }
            }
            return singleLeton;
        }
}
