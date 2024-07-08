#include <stdbool.h>
#include <string.h>

bool isValidWalk(const char *walk) 
{
    int steps = strlen(walk);
  
    if(steps != 10)
      return false;
  
    int inTime = 0;
      
    for(int i = 0; i < steps; i++)
    {
      switch(walk[i])
      {
          case 'n': inTime+=1; break;
          case 'w': inTime+=2; break;
          case 's': inTime-=1; break;
          case 'e': inTime-=2; break;
          default: break;
      }
    }
  
  return (inTime == 0);
}
