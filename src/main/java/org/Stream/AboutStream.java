package org.Stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Ayin
 * @verison 1.0
 * @date 2024/4/9
 * @description Stream流的相关API
 */
public class AboutStream {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
//        trick(name);
        List<Integer> num=new ArrayList<>();
        //trickB(num);
        //trickC();
        trickD();
    }
    /**
     * 1.目的：用于简化集合和数组操作的API
     * 2.作用：简化集合，数组操作的API。结合了Lambda表达式
     * */
    private static void trickA(List<String> name){

    }
    /**
     * Collections类的addAll方法是添加元素。第一个参数为需要操作的数组或者元素，需要添加的元素
     * filter()方法：e代表的遍历的每个元素。
     * collect()方法：调用Collectors类的toList方法。返回的是数组。
     * forEach()方法：遍历过每个元素
     * */
    private static  void trickB(List<Integer> num){
        Collections.addAll(num,1,2,3,4,5,6,7,8);
             num.stream().filter(e -> e % 2 == 0)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
    /**
     * Stream流的map方法:将流中的每个元素映射为另一个元素，生成一个新的流。
     * */
    private static  void trickC(){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().map(s->s.charAt(0)).forEach(System.out::println);//[A,B,C]
        names.stream().map(String::length).forEach(System.out::println);//[5,3,7]
    }
    /**
     * Stream流sorted方法:对流中的元素进行排序，默认是自然顺序排序，也可以传入Comparator进行自定义排序。
     * o1,o2的传值是顺序传递。根据o1-o2的差值。判断谁在前，谁在后。o1-o2大于0.说明o1大.以此类推。
     * */
    private static void trickD(){
        //自定义排序
        Comparator<Integer> integerComparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1; //降序
                //return o1-o2; //升序
            }
        };
        List<Integer> names = Arrays.asList(7,4,254,6,3,77,3,42,43);
        names.stream().sorted(integerComparator).forEach(System.out::println);
        //names.stream().sorted().forEach(System.out::println);
    }
}
