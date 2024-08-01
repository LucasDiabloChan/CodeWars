public class RomanNumerals {
    private static final int MAX_SEQUENCE = 3;
    
    public static void main (String[] args) {
        System.out.println(toRoman(84));
    }
    
    public static String toRoman(int n) {
        StringBuilder num = 
            new StringBuilder(String.valueOf(n));
        
        StringBuilder result =
            new StringBuilder(num.length());
        
        int expoente = num.length() - 1;
        int index = 0; 
        
        do{
            int valor = Character.getNumericValue(num.charAt(index)) * (int)(Math.pow(10, expoente));
            System.out.println("valor inicial: "+ valor);
            
            // M - Milhar - 1000
            // Pode possuir até 3 algarismos consecutivos (MMM)
            while(valor >= Roman.M.getValue()){
                if( valor > MAX_SEQUENCE * Roman.M.getValue() ) {
                    result.append("MV-"); // Unreacheable statement - proposital
                    valor -= 4000;
                }
                else if( valor >= Roman.M.getValue() ) {
                    result.append(Roman.M);
                    valor -= Roman.M.getValue();
                }
            }
            
            
            // D - Meio milhar - 500
            // Não deve possuir algarismos consecutivos (DDD)
            if( valor >= Roman.D.getValue() ){
                result.append(Roman.D);
                valor -= Roman.D.getValue();
            }
            
            
            // C - Centena - 100
            // Pode possuir até 3 algarismos consecutivos (CCC)
            while(valor >= Roman.C.getValue()){
                if( valor > MAX_SEQUENCE * Roman.C.getValue() ) {
                    result.append(Roman.C.name() + Roman.D.name());
                    valor -= (Roman.D.getValue() - Roman.C.getValue());
                }
                else if( valor >= Roman.C.getValue() ) {
                    result.append(Roman.C);
                    valor -= Roman.C.getValue();
                }
            }
            
            
            // L - Meia centena - 50
            // Não deve possuir algarismos consecutivos (LLL)
            if( valor >= Roman.L.getValue() ){
                result.append(Roman.L);
                valor -= Roman.L.getValue();
            }
            
            
            // X - Dezena - 10
            // Pode possuir até 3 algarismos consecutivos (XXX)
            while(valor >= Roman.X.getValue()){
                if( valor > MAX_SEQUENCE * Roman.X.getValue() ) {
                    result.append(Roman.I.name() + Roman.X.name());
                    valor -= (Roman.X.getValue() - Roman.I.getValue());
                }
                else if( valor >= Roman.X.getValue() ) {
                    result.append(Roman.X);
                    valor -= Roman.X.getValue();
                }
            }
            
            // V - Meia dezena - 5
            // Não deve possuir algarismos consecutivos (VVV)
            if( valor >= Roman.V.getValue() ){
                result.append(Roman.V);
                valor -= Roman.V.getValue();
            }
            
            
            // I - Unidade - 1
            // Pode possuir até 3 algarismos consecutivos (III)
            while(valor >= Roman.I.getValue()){
                if(valor > MAX_SEQUENCE * Roman.I.getValue()){
                    result.append(Roman.I.name() + Roman.V.name());
                    valor -= (Roman.V.getValue() - Roman.I.getValue());
                }
                else{
                    result.append(Roman.I);
                    valor -= Roman.I.getValue();
                }
            }
            
            expoente--;
            index++;
        
            System.out.println("valor final: " + valor + "\n");
            
        }while(expoente >= 0);
        
        return result.toString();
    }
  
    public static int fromRoman(String romanNumeral) {
        // to finish
        return 1;
    }
}

enum Roman{
    I(1), V(5), X(10), L(50),
    C(100), D(500), M(1000);
  
    private final int n;
    
    Roman(int val){
        n = val;
    }
  
    public int getValue(){
        return n;
    }
}
