<?php
    /*
     - Author: Asher_Ren
     - Code Wars Kata: String ends with? (available in: https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d)
     - Description: verify if a given string matches with the end of another given string
     - Date: 28/06/2024
    */


    function solution($str, $ending) {
        $str_len = strlen($str);
        $end_len = strlen($ending);
        
        if($end_len > $str_len)
          return false;
      
        $end_of_str = substr($str, ($str_len - $end_len));
          
        if(!($end_of_str == $ending))
          return false;
      
        return true;
    }

?>
