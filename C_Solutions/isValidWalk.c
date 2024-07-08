  /*
   - Author: Asher_Ren
   - Code Wars Kata: Take a Ten Minutes Walk (available in: https://www.codewars.com/kata/54da539698b8a2ad76000228)
   - Description: given a string, you need to verify if its a valid walk (bring the walker to the start point, in 10 minutes)
   - Date: 08/07/2024
  */

#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool isValidWalk(const char *walk) 
{
    int steps = strlen(walk);
  
    if(steps != 10)
      return false;
  
    int vertical = 0, horizontal = 0;
      
    for(int i = 0; i < steps; i++)
    {
      switch(walk[i])
      {
          case 'n': vertical+=1; break;
          case 's': vertical-=1; break;
          case 'w': horizontal+=2; break;
          case 'e': horizontal-=2; break;
          default: break;
      }
    }
  
  return (vertical == 0 && horizontal == 0);
}
