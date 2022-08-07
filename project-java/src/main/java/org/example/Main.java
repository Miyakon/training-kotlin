package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Exception {
//         変数にnullをセット
//         String str = "";
//
//         System.out.println("Lesson01");
//         if (str != null) {
//             System.out.println(str.toUpperCase());
//         } else {
//             System.out.println("strはnullです");
//         }
//         System.out.println("Hello");
//
//         System.out.println("Lesson02");
//        Optional<String> opt_str = Optional.ofNullable(str);
//        opt_str.ifPresent(f -> System.out.println(f));

//        class OjbPack<T> {
//            private T obj;
//
//            public OjbPack(T obj) {
//                this.obj = obj;
//            }
//
//            public T getObj(){
//                return obj;
//            }
//
//        }
//
//        OjbPack<Integer> op1 = new OjbPack<Integer>(123);
//        Integer in = op1.getObj();
//
//        OjbPack<String> op2 = new OjbPack<String>("string");
//        String st = op2.getObj();
//
//        System.out.println(in);
//        System.out.println(st);

//        List<String> list = new ArrayList<String>();
//        list.add("a");
//        list.add("b");
//
//        for (String s:list){
//            System.out.println(s);
//        }

        System.out.println("Value of object obj is : " + obj);

        Integer i = null;
        Integer j = 10;
        String s = "10";

// false
        System.out.println(i instanceof Integer);
// true
        System.out.println(j instanceof Integer);
    }
    private static Object obj;
}