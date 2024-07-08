<?php
  /*
   - Author: Asher_Ren
   - Code Wars Kata: Does my number look big in this? (available in: https://www.codewars.com/kata/5287e858c6b5a9678200083c)
   - Description: given a number, you need to verify if it's a narcissistic number (or Armstrong number)
   - Date: 07/07/2024
  */

function narcissistic(int $value): bool {
  $digits_len = strlen($value);
  $numbers = str_split($value);
  $soma = 0;
  
  foreach($numbers as $num){
    $soma += pow($num, $digits_len);
  }
  
  return ($soma == $value) ? true : false;
}
?>
