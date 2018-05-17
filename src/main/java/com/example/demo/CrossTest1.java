package com.example.demo;

import java.io.*;
import java.util.*;

public class CrossTest1 {
	
    /**
     * Complete the function below.
     * DONOT MODIFY anything outside this function!
     */
    static int[] rearrange(int[] elements) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<elements.length; i++){
            int c = countOnes(elements[i]);
            map.put(elements[i], c);

        }

        LinkedHashMap<Integer, Integer> sortedMap = sortHashMapByValues(map);
        int[] results = new int[elements.length];
        Integer[] integers = sortedMap.keySet().toArray(new Integer[elements.length]);
        for(int k=0; k<integers.length; k++){
            results[k] = integers[k];
        }

        return results;

    }

    public static int countOnes(int no) {
        int count = 0;
        int i = 0, temp[] = new int[7];
        int binary[];
        while (no > 0) {
            temp[i++] = no % 2;
            no /= 2;
        }
        binary = new int[i];
        int k = 0;
        for (int j = i - 1; j >= 0; j--) {
            binary[k++] = temp[j];
            if(temp[j] == 1){
                count++;
            }
        }

        return count;
    }

    public static LinkedHashMap<Integer, Integer> sortHashMapByValues(
            HashMap<Integer, Integer> passedMap) {
        List<Integer> mapKeys = new ArrayList<>(passedMap.keySet());
        List<Integer> mapValues = new ArrayList<>(passedMap.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

        LinkedHashMap<Integer, Integer> sortedMap =
                new LinkedHashMap<>();

        Iterator<Integer> valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Integer val = valueIt.next();
            Iterator<Integer> keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                Integer key = keyIt.next();
                Integer comp1 = passedMap.get(key);
                Integer comp2 = val;

                if (comp1.equals(comp2)) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }
        }
        return sortedMap;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = 0;
        n = Integer.parseInt(in.nextLine().trim());
        int[] elements = new int[n];
        int element;
        for (int i = 0; i < n; i++) {
            element = Integer.parseInt(in.nextLine().trim());
            elements[i] = element;
        }
        
        // call rearrange function
        int[] results = rearrange(elements);
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }
}