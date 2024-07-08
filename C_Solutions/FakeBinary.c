// @AsherLucRen
// Receive a number (string) and return a binary value, where 0 is < 5 and 1 is >= 5

#include <string.h>

// = = = = = = = = = = = = = =

void fakeBin(const char *digits, char *binary) {
  
  int i, strSize = strlen(digits);
  
  for(i = 0; i < strSize; i++)
  {
    switch(digits[i])
    {
      case '0': case '1': case '2':
      case '3': case '4':
        binary[i] = '0';
        break;
      case '5': case '6': case '7':
      case '8': case '9':
        binary[i] = '1';
        break;
      default:
        break;
    }
  }  
  binary[strSize] = '\0'; 	
}
