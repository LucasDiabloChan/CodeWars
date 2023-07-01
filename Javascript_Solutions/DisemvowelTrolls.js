// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = //
/*
 * Description: Remove all vowels of a string
 * Author: Asher Ren (Lucas)
 * Created at: 01/07/2023
 */
// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = //

function disemvowel(str) {
  
  // Get the chars array
  arrayChar = str.split("");
  
  // Create a place to save the disemvoweled string
  newString = "";
  
  // For each char, verify if it's a vowel
  // If yes: ignore they. || If not: add to final str
  for(i = 0; i < arrayChar.length; i++){
    switch(arrayChar[i].toLowerCase()){
        case 'a': case 'e': case 'i': case 'o': case 'u':
          continue;
        default:
          newString += arrayChar[i];
    }
  }
  
  // Return the string
  return newString;
}
