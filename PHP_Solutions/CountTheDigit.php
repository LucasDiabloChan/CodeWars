<?php
    /*
     - Author: Asher_Ren
     - Code Wars Kata: Count the digit (available in: https://www.codewars.com/kata/566fc12495810954b1000030)
     - Description: calculate every k**2 between 0 and a given N, counting all numbers that contains a given digit
     - Date: 02/07/2024
    */

function nbDig($n, $d) {
    if($n < 0 || $d < 0 && $d > 9)
      return;
    
    $squares = [];
    
    for($i = 0; $i <= $n; $i++){
      $squares[] = $i*$i;
    }
    
    $cont = 0;
  
    for($i = 0; $i < count($squares); $i++){
      if(str_contains($squares[$i], $d))
        $cont++;
    }
  
  return $cont;
}
?>
