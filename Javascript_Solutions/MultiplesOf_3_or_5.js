// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = //
/*
 * Description: Sum every number who is multiple of 3 or 5
 * Author: Asher Ren (Lucas)
 * Created at: 01/07/2023
 */
// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = //

function solution(number){
  somaDasBases = 0;
  
  if(number < 0){
    return 0;
  }
  
  for(i = 0; i < number; i++){
    if(i % 3 == 0 || i % 5 == 0)
      somaDasBases += i;
  }
  
  return somaDasBases;
}
