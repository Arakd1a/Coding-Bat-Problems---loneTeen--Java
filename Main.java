public boolean loneTeen(int a, int b) {
  boolean tA = (a>=13&&a<=19); 
  boolean tB = (b>=13&&b<=19); 
  return(tA&&!tB||!tA&&tB);
  }
