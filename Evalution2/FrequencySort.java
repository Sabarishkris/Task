package Evalution2;

import java.util.*;

public class FrequencySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        //int size=sc.nextInt();
        //int []a=createNewArray(size,sc);
        int[] num = {4, 1, 2, 3, 1, 2, 5, 2};
        Map<Integer, Integer> map = getFrequency(num);
        Set<Integer> st = getSetValue(map);
        List<Integer> lt = new ArrayList<>(st);
        Collections.reverse(lt);
        System.out.println(lt);
        System.out.println(map);
        printAns(lt, map);
    }

    private static void printAns(List<Integer> lt, Map<Integer, Integer> map) {
        for (int temp : lt) {
            for (Map.Entry<Integer, Integer> temp1 : map.entrySet()) {
                if (temp1.getValue() == temp) {
                    for (int i = 0; i < temp; i++) {
                        System.out.print(temp1.getKey());
                    }
                }
            }
        }
    }

    private static Set<Integer> getSetValue(Map<Integer, Integer> map) {
        Set<Integer> st = new TreeSet<>();
        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
            st.add(temp.getValue());
        }
        return st;
    }

    private static Map<Integer, Integer> getFrequency(int[] num) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int temp : num) {
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        return map;
    }

    private static int[] createNewArray(int size, Scanner sc) {
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }
}
