// finishing...

import java.util.Stack;

class Main {
    public static void main(String[] args) {
        int num = 15;
        
        Stack<Integer> integers = new Stack<Integer>();
        String parsedN = String.valueOf(num);

        for(String c : parsedN.toCharArray()){
            integers.add(Integer.valueOf(c));
            System.out.println(c);
        }

        System.out.println(" - - - - - - - - - ");
        
        for(int i = 0; i < integers.size(); i++){
            String numberToConvert = integers.pop() + "";
            //+ "0".repeat(i));
            System.out.println("_"+numberToConvert+"_");

            switch (numberToConvert) {
                case "10":
                    break;
            }
        }
        
    }
}
