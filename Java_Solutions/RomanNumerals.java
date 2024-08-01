public class RomanNumerals{
    private static final int MAX_SEQUENCE = 3;
    
    public static void main (String[] args) throws Exception{
        
        System.out.println("De inteiro para romano");
        System.out.println(toRoman(1666));
        System.out.println(toRoman(598));
        System.out.println(toRoman(90));
        
        System.out.println("De romano para inteiro");
        System.out.println(fromRoman(toRoman(1666)));
        System.out.println(fromRoman(toRoman(598)));
        System.out.println(fromRoman(toRoman(90)));
        System.out.println(fromRoman(toRoman(8)));
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
            
            // M - Milhar - 1000
            // Pode possuir até 3 algarismos consecutivos (MMM)
            while(valor >= Roman.M.getValue()){
                if(valor > MAX_SEQUENCE * Roman.M.getValue()){
                    result.append("MV-"); // Unreacheable statement - proposital
                    valor -= 4000;
                }
                else if(valor >= Roman.M.getValue()){
                    result.append(Roman.M);
                    valor -= Roman.M.getValue();
                }
            }
            
            
            // D - Meio milhar - 500
            // Não deve possuir algarismos consecutivos (DDD)
            if(valor >= (Roman.M.getValue() - Roman.C.getValue())){
                result.append(Roman.C.name() + Roman.M.name());
                valor -= (Roman.M.getValue() - Roman.C.getValue());
            }
            else if(valor >= Roman.D.getValue()){
                result.append(Roman.D);
                valor -= Roman.D.getValue();
            }
            
            
            // C - Centena - 100
            // Pode possuir até 3 algarismos consecutivos (CCC)
            while(valor >= Roman.C.getValue()){
                if(valor > MAX_SEQUENCE * Roman.C.getValue()){
                    result.append(Roman.C.name() + Roman.D.name());
                    valor -= (Roman.D.getValue() - Roman.C.getValue());
                }
                else if(valor >= Roman.C.getValue()){
                    result.append(Roman.C);
                    valor -= Roman.C.getValue();
                }
            }
            
            
            // L - Meia centena - 50
            // Não deve possuir algarismos consecutivos (LLL)
            if(valor >= (Roman.C.getValue() - Roman.X.getValue())){
                result.append(Roman.X.name() + Roman.C.name());
                valor -= (Roman.C.getValue() - Roman.X.getValue());
            }
            else if(valor >= Roman.L.getValue()){
                result.append(Roman.L);
                valor -= Roman.L.getValue();
            }
            
            
            // X - Dezena - 10
            // Pode possuir até 3 algarismos consecutivos (XXX)
            while(valor >= Roman.X.getValue()){
                if(valor > MAX_SEQUENCE * Roman.X.getValue()){
                    result.append(Roman.I.name() + Roman.X.name());
                    valor -= (Roman.X.getValue() - Roman.I.getValue());
                }
                else if(valor >= Roman.X.getValue()){
                    result.append(Roman.X);
                    valor -= Roman.X.getValue();
                }
            }
            
            // V - Meia dezena - 5
            // Não deve possuir algarismos consecutivos (VVV)
            if(valor >= (Roman.X.getValue() - Roman.I.getValue())){
                result.append(Roman.I.name() + Roman.X.name());
                valor -= (Roman.X.getValue() - Roman.I.getValue());
            }
            else if( valor >= Roman.V.getValue() ){
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
        }while(expoente >= 0);
        
        return result.toString();
    }
  
    public static int fromRoman(String romanNumeral) throws Exception{
        char[] algarismos = romanNumeral.toCharArray();
        int limit = algarismos.length - 1;
        int result = 0;
        
        for(int i = 0; i < limit; i++){
            // if(i == limit-1)
            //     Roman lastDigit = getAlgarismoEquivalente(algarismos[i]);
            
            Roman digitA = getAlgarismoEquivalente(algarismos[i]);
            Roman digitB = getAlgarismoEquivalente(algarismos[i+1]);
            
            System.out.println("A: " + digitA + " | B: " + digitB);
            
            if (digitA.getValue() > digitB.getValue()){
                result += digitA.getValue();
            }
            else if(digitA.getValue() < digitB.getValue()){
                result += (digitB.getValue() - digitA.getValue());
                i++;
            }
            else{
                result += digitA.getValue();
                i++;
            }
            
            if(i == limit-1 && (limit+1)%2!=0)
                result += getAlgarismoEquivalente(algarismos[limit]).getValue();
        }
        
        
        
        return result;
    }
    
    private static Roman getAlgarismoEquivalente(char algarismo) throws Exception{
        switch(algarismo){
            case 'M': return Roman.M;
            case 'D': return Roman.D;
            case 'C': return Roman.C;
            case 'L': return Roman.L;
            case 'X': return Roman.X;
            case 'V': return Roman.V;
            case 'I': return Roman.I;
            default: throw new Exception("Unknown digit!");
        }
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
