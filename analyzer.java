public class exo1 {
    private String input;
    int i;
    private boolean te;
    public exo1(String input){
          this.input = input + "#"; 
          this.i=0;
          this.te=true;
    }
    
    public void Z(){
        S();
         if(input.charAt(i)=='#'   && i ==input.length()-1 && te == true   ){
            System.out.println("chaine accepter ");
        } else 
              System.out.println("chaine erronée "); }
        
    public void S(){
        if(input.charAt(i)== 'x'){
            i++;
        } else 
            if(input.charAt(i)== 'y'){
                i++;
            } else 
                if(input.charAt(i)=='('){
                    i++;
                    if(input.charAt(i)== 'x' || input.charAt(i)== 'y' || input.charAt(i)=='('  )
                    T(); 
                    if(input.charAt(i)==')'){
                i++;
            } else {
                       te = false; }
                }
    }
               public void T(){
                    if(input.charAt(i)== 'x' || input.charAt(i)== 'y' || input.charAt(i)=='('  ) {
                        S();
                        SS();
                    }
               }
            
                   public void SS(){
                        if(input.charAt(i)== ',') {
                
                        A();
                                } 
                   }
        public void A(){
            if(input.charAt(i)== ',') { 
                    i++;
                    S();
                    A();
            }
        }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Entrez une chaîne : ");
          String input = sc.nextLine();
          exo1 f = new exo1(input);
          f.Z();
    }
}
