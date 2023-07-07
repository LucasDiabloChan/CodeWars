function isSquare($n){
  $s = (int)(sqrt($n));
  return ($n >= 0 && ($s * $s == $n)) ? true : false;
}
