package com.example.demo;

import java.io.*;
import java.util.*;

public class Tester {
	
    /**
     * Complete the function below.
     * DO NOT MODIFY anything outside this method. 
     */
    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
        int[] result = new int[expressions.length];
        for(int i = 0; i<expressions.length; i++){
            //count num of < and > are equals if not replace > with <>,
            HashMap<Character, Integer> map = new HashMap<>();
            map.put('<', 0);
            map.put('>', 0);
            char[] charArray = expressions[i].toCharArray();
            for (int c=0; c<charArray.length; c++){
                map.put(charArray[c], map.get(charArray[c]) + 1);
            }
            //if chararray ends with < return 0
            if(charArray[charArray.length-1] == '<'){
                result[i] = 0;
            }else if(map.get('<') == map.get('>')){
                boolean b =checkMatch(charArray, maxReplacements[i]);
                if(b){
                    result[i] = 1;
                }else{
                    result[i] = 0;
                }
            }else{
                boolean b =checkMatch(charArray, maxReplacements[i]);
                if(b){
                    result[i] = 1;
                }else{
                    result[i] = 0;
                }
            }

        }



        return result;
    }

    /**
     * This method checks < with > by pushing < to stack and removing pair of it from stack
     * I check and not return false until maxreplacement count not reached to 0
     * @param str
     * @param maxReplacement
     * @return
     */
    public static boolean checkMatch(char[] str, int maxReplacement) {
        Stack<Character> stack = new Stack<Character>();

        char c;
        for(int i=0; i < str.length; i++) {
            c = str[i];
            if(c == '<'){
                stack.push(c);
            }else if(c == '>'){
                if(stack.empty()){
                    if(maxReplacement != 0){
                        maxReplacement--;
                    }else{
                        return false;
                    }
                }
                else if(stack.peek() == '<'){
                    stack.pop();
                }
                else{
                    if(maxReplacement != 0){
                        maxReplacement--;
                    }else{
                        return false;
                    }
                }


            }

        }

        if (stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
     public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] res;
        
        int _expressions_size = 0;
        _expressions_size = Integer.parseInt(in.nextLine().trim());
        String[] _expressions = new String[_expressions_size];
        String _expressions_item;
        for (int _expressions_i = 0; _expressions_i < _expressions_size; _expressions_i++) {
            try {
                _expressions_item = in.nextLine();
            } catch (Exception e) {
                _expressions_item = null;
            }
            _expressions[_expressions_i] = _expressions_item;
        }
        
        int _maxReplacements_size = 0;
        _maxReplacements_size = Integer.parseInt(in.nextLine().trim());
        int[] _maxReplacements = new int[_maxReplacements_size];
        int _maxReplacements_item;
        for (int _maxReplacements_i = 0; _maxReplacements_i < _maxReplacements_size; _maxReplacements_i++) {
            _maxReplacements_item = Integer.parseInt(in.nextLine().trim());
            _maxReplacements[_maxReplacements_i] = _maxReplacements_item;
        }
        
        res = balancedOrNot(_expressions, _maxReplacements);
        for (int res_i = 0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }
    }
}