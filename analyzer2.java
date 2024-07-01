public class tp1 {
     private int i;
     private String c;
    

    public tp1(String c) {
    this.i=0;
    this.c= c+ "#";
    }
    public void Z() {
        S();
        if (c.charAt(i) == '#' && i == c.length()-1) {
            System.out.println("chaine accepter ");
        } else {
            System.out.println("chaine erronée ");
        }
    }
    public void S(){
        if(c.charAt(i)=='c'){
            C();
            S();
            if(c.charAt(i)=='d'){
                i++;
            } else {
                erreur();
            }
            
        }
        else 
          if(c.charAt(i)=='a') {
            A();
            B();
        }
          else 
            if(c.charAt(i)=='b') {
            B();
        } else 
           if(c.charAt(i)=='d'&& c.length()-1 == 1) {
           i++;
        }
       
    }
    public void A() {
       if(c.charAt(i)=='a'){
           i++;
           A();
       } if(c.charAt(i)=='b'){
                i++;
            } else {
                erreur();
            }
    }
    public void B() {
           if(c.charAt(i)=='b'){
           i++;
           B();
       }
    }
        public void C() {
           if(c.charAt(i)=='c'){
           i++;
           C();
       }
    }
    public void erreur (){
        System.out.println("erreur");
        System.exit(0);
    }
    
    
    
    
    
        public static void main(String[] args) {
            System.out.println("donner");
            Scanner e = new Scanner (System.in);
            String c = e.nextLine();
            
            tp1 t = new tp1(c);
            t.Z();
                    
        }
    

    
  
}
