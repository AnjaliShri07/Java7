package com.java7.programs.String;

import java.util.Stack;

public class BracketsBalance
{
	private static final char l_paren = '(';
	private static final char r_paren = ')';
	private static final char l_brace = '{';
	private static final char r_brace = '}';
	private static final char l_bracket = '[';
	private static final char r_bracket = ']';

	public static boolean isBalanced(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == l_paren)
			{
				stack.push(l_paren);
			}
			else if(s.charAt(i) == l_brace)
			{
				stack.push(l_brace);
			}
			else if(s.charAt(i) == l_bracket)
			{
				stack.push(l_bracket);
			}
			else if(s.charAt(i) == r_paren)
			{
				if(stack.isEmpty())
				{
					return false;
				}
				if(stack.pop() != l_paren)
				{
					return false;
				}
			}
			else if(s.charAt(i) == r_brace)
			{
				if(stack.isEmpty())
				{
					return false;
				}
				if(stack.pop() != l_brace)
				{
					return false;
				}
			}
			else if(s.charAt(i) == r_bracket)
			{
				if(stack.isEmpty())
				{
					return false;
				}
				if(stack.pop() != l_bracket)
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args)
	{
		String s = "[{()}]";
		System.out.println(isBalanced(s));
	}
}
