package com.gl.lab3;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

  boolean isBalanced(String str) {

    Stack < Character > stack = new Stack < Character > ();

    int len = str.length();

    for (int i = 0; i < len; i++) {
      if (stack.isEmpty()) {
        stack.push(str.charAt(i));

      } else if ((stack.peek() == '{' && str.charAt(i) == '}') || (stack.peek() == '[' && str.charAt(i) == ']') || (stack.peek() == '(' && str.charAt(i) == ')')) {
        stack.pop();
      } else {
        stack.push(str.charAt(i));
      }
    }
    if (stack.isEmpty()) {
      return true;
    }
    return false;

  }
  boolean checkString(String str) {
	  String checkStr = "(){}[]";
	    for(int j = 0; j<str.length(); j++) {
	    	if(checkStr.indexOf(str.charAt(j)) !=-1)
	    		continue;
	    	else 
	    		return false;	    	   	
	    }
	    return true;
  }

  public static void main(String[] args) {
    BalancedBrackets b = new BalancedBrackets();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the string of brackets");
    String str = sc.nextLine();
    
    if (b.checkString(str)) {
    if (b.isBalanced(str)) {
      System.out.println(str + " is balanced");
    } else {
      System.out.println(str + " is not balanced");
    }
    sc.close();
  }else {
	  System.out.println("enter string which contains only brackets");
  }
  }
 
}