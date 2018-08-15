class prob44{
  public static void main (String[] args){

    System.out.println(isMatch("aaaabaaaabbbbaabbbaabbaababbabbaaaababaaabbbbbbaabbbabababbaaabaabaaaaaabbaabbbbaababbababaabbbaababbbba",
    "*****b*aba***babaa*bbaba***a*aaba*b*aa**a*b**ba***a*a*"));
  }
  public static boolean isMatch(String s, String p) {
      StringBuffer sb = new StringBuffer("");
      for(int i = 0; i<p.length(); i++){
          if(p.charAt(i)=='?')
              sb.append(".{1}");
          else if(p.charAt(i)=='*')
              sb.append(".*");
          else
              sb.append(p.charAt(i));
      }
      return s.matches(sb.toString());
  }
}
